package co.istad.springminiproject.repository;

import co.istad.springminiproject.model.Article;
import co.istad.springminiproject.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArticleRepository {
    List<Article> articles = new ArrayList<>(){{
        add(new Article(101, "", new AuthorRepository().getAllAuthor().get(0),new Category[]{new CategoryRepository().getAllCategory().get(1), new CategoryRepository().getAllCategory().get(3)}, "https://wallpapercave.com/wp/wp6340343.jpg"));
        add(new Article(102, "", new AuthorRepository().getAllAuthor().get(1),new Category[]{new CategoryRepository().getAllCategory().get(2)}, "https://www.denofgeek.com/wp-content/uploads/2021/02/spider-man-shattered-dimensions-no-way-home.jpg?fit=2560%2C1440"));
        add(new Article(103, " ", new AuthorRepository().getAllAuthor().get(2),new Category[]{new CategoryRepository().getAllCategory().get(2)}, "https://i.pinimg.com/originals/93/15/3a/93153ad8e24e3c504bb3576ff5856e79.jpg"));
        add(new Article(104, "",  new AuthorRepository().getAllAuthor().get(2),new Category[]{new CategoryRepository().getAllCategory().get(3)}, "https://simkl.net/episodes/45/4557474ecd57b300f_w.jpg"));
    }};

    public List<Article> getAllArticle() {
        return articles;
    }

    public Article getArticleByID(int id) {
        return articles.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public List<Article> getArticleByAuthorName(String name) {
        return articles.stream().filter(e -> Objects.equals(e.getAuthor().getName(), name)).toList();
    }

    public void addNewArticle(Article article) {
        articles.add(article);
    }

    public void deleteArticleByID(int id) {
        articles.remove(articles.stream().filter(e -> e.getId() == id).findFirst().orElse(null));
    }
}
