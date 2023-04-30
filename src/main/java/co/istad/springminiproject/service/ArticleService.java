package co.istad.springminiproject.service;

import co.istad.springminiproject.model.Article;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ArticleService {
    List<Article> getAllArticle();
    Article getViewDetailByID(int id);
    List<Article> getArticleByAuthorName(String name);

    void addNewArticle (Article article);
    void deleteArticleByID(int id);
}
