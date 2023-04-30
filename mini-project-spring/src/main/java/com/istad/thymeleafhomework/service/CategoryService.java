package com.istad.thymeleafhomework.service;

import com.istad.thymeleafhomework.Model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();
    List<Category> getALlCategoryByName(String name);
}
