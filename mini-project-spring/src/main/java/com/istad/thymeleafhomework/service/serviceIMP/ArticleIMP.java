package com.istad.thymeleafhomework.service.serviceIMP;

import com.istad.thymeleafhomework.Model.Articles;
import com.istad.thymeleafhomework.repository.ArticleRepository;
import com.istad.thymeleafhomework.service.ArticlesInterFace;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ArticleIMP implements ArticlesInterFace {
    ArticleRepository articleRepository;
    ArticleIMP() {
        articleRepository = new ArticleRepository();
    }

    @Override
    public List<Articles> getAllArticle() {
        return articleRepository.getAllArticle();
    }

    @Override
    public Articles getViewDetailByID(int id) {
        return articleRepository.getArticleByid(id);
    }

    @Override
    public List<Articles> getArticleByAuthorName(String name) {
        return articleRepository.getArticleByAuthorName(name);
    }


    @Override
    public void addNewArticle(Articles articles) {
        articleRepository.addNewArticle(articles);
    }

    @Override
    public void deleteArticleByID(int id) {
        articleRepository.deleteArticle(id);
    }

}
