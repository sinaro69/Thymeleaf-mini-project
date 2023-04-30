package co.istad.springminiproject.controller;

import co.istad.springminiproject.model.Article;
import co.istad.springminiproject.model.Author;
import co.istad.springminiproject.model.Category;
import co.istad.springminiproject.model.request.PostRequest;
import co.istad.springminiproject.service.ArticleService;
import co.istad.springminiproject.service.AuthorService;
import co.istad.springminiproject.service.CategoryService;
import co.istad.springminiproject.service.FileUploadService;
import jakarta.validation.Valid;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Controller
public class HomeController {
    CategoryService categoryService;
    ArticleService articleService;
    AuthorService authorService;
    FileUploadService fileUploadService;
    @Autowired
    public HomeController(CategoryService categoryService,ArticleService articleService,AuthorService authorService) {
        this.categoryService = categoryService;
        this.articleService = articleService;
        this.authorService = authorService;
    }

    @GetMapping("/index")
    public String ReturnHomepage(Model model){
        model.addAttribute("categories", categoryService.getAllCategory());
        model.addAttribute("article", articleService.getAllArticle().stream().sorted(((a, b) -> b.getId()-a.getId())));
        return "index";
    }
    @GetMapping ("/category/{category}")
    public String ViewCategoryType(@PathVariable String category, Model model){
        model.addAttribute("categories", categoryService.getALlCategoryByName(category));
        return "category-type";
    }

    @GetMapping("/All-User")
    public String allUsersDisplay(Model model){
        model.addAttribute("Authors", authorService.getAllAuthor());
        model.addAttribute("article", articleService.getAllArticle());
        model.addAttribute("categories", categoryService.getAllCategory());
        return "all-users";
    }

    @GetMapping("/delete/{id}")
    public String deleteArticle(@PathVariable("id") String id){
        articleService.deleteArticleByID(Integer.parseInt(id));
        return "redirect:/index";
    }
    @GetMapping("/new-article-form")
    public String getUserForm(Model model){
        model.addAttribute("article", new PostRequest());
        model.addAttribute("authors", authorService.getAllAuthor());
        model.addAttribute("categories",categoryService.getAllCategory());
        return "add-new-post";
    }
    @PostMapping("/handleAddArticle")
    public String handleArticle(@Valid @ModelAttribute("article") PostRequest articles,
                                BindingResult bindingResult,
                                Model model
    ){
        if(bindingResult.hasErrors()){
            model.addAttribute("authors", authorService.getAllAuthor());
            model.addAttribute("categories",categoryService.getAllCategory());
            return "/add-new-post";
        }
        Article newArticle = new Article();

        try {
            String filename = "http://localhost:8080/images/" + fileUploadService.uploadFile(articles.getFile());
            newArticle.setPost_img(filename);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Error happened!");
        }

        newArticle.setDescription(articles.getDescription());
        newArticle.setCategory(newArticle.getCategory());
        Author author = authorService.getAllAuthor().stream().filter(e->e.getId() == articles.getAuthorID()).findFirst().orElse(null);
        newArticle.setAuthor(author);
        newArticle.setId(articleService.getAllArticle().stream().max(Comparator.comparingInt(Article::getId)).stream().toList().get(0).getId() + 1);
        List<Category> categories = new ArrayList<>();
        for (int cate : articles.getCategoryID()){
            categories.add(categoryService.getAllCategory().stream().filter(e->e.getId() == cate).findFirst().orElse(null));
        }
        Category[] categories1 = categories.toArray(new Category[categories.size()]);
        newArticle.setCategory(categories1);

        articleService.addNewArticle(newArticle);
        return "redirect:/index";
    }
}
