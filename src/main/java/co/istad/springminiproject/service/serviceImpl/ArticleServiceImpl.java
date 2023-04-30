package co.istad.springminiproject.service.serviceImpl;

import co.istad.springminiproject.model.Article;
import co.istad.springminiproject.repository.ArticleRepository;
import co.istad.springminiproject.service.ArticleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceImpl implements ArticleService {
    ArticleRepository articleRepository;
    ArticleServiceImpl() {
        articleRepository = new ArticleRepository();
    }
    @Override
    public List<Article> getAllArticle() {
        return articleRepository.getAllArticle();
    }

    @Override
    public Article getViewDetailByID(int id) {
        return articleRepository.getArticleByID(id);
    }

    @Override
    public List<Article> getArticleByAuthorName(String name) {
        return articleRepository.getArticleByAuthorName(name);
    }

    @Override
    public void addNewArticle(Article article) {
        articleRepository.addNewArticle(article);

    }

    @Override
    public void deleteArticleByID(int id) {
       articleRepository.deleteArticleByID(id);
    }
}
