package co.istad.springminiproject.service;

import co.istad.springminiproject.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();
    List<Category> getALlCategoryByName(String name);
}
