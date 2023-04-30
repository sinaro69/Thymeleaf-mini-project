package com.istad.thymeleafhomework.repository;

import com.istad.thymeleafhomework.Model.Articles;
import com.istad.thymeleafhomework.Model.Category;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Repository
public class CategoryRepository {
    List<Category> categories = new ArrayList<>(){{
        add(new Category(1, "Sport"));
        add(new Category(2, "Programming"));
        add(new Category(3, "Education"));
        add(new Category(4, "Science"));
        add(new Category(5, "Biology"));
    }};

    public List<Category> getAllCategory(){
        return categories;
    }
    public List<Category> getCategoriesByName(String name){
        return categories.stream().filter(e-> Objects.equals(e.getCategoriesList(), name)).toList();
    }
}
