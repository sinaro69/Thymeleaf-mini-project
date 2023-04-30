package com.istad.thymeleafhomework.service;

import com.istad.thymeleafhomework.Model.Articles;

import java.util.List;

public interface ArticlesInterFace {
    List<Articles> getAllArticle();
    Articles getViewDetailByID(int id);
    List<Articles> getArticleByAuthorName(String name);

    void addNewArticle (Articles articles);
    void deleteArticleByID(int id);
}
