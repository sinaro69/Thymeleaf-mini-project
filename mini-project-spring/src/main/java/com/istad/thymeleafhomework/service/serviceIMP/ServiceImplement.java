package com.istad.thymeleafhomework.service.serviceIMP;

import com.istad.thymeleafhomework.Model.Category;
import com.istad.thymeleafhomework.repository.CategoryRepository;
import com.istad.thymeleafhomework.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplement implements CategoryService {
    CategoryRepository categoryRepository;
    ServiceImplement() {
        categoryRepository = new CategoryRepository();
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.getAllCategory();
    }

    @Override
    public List<Category> getALlCategoryByName(String name) {
        return categoryRepository.getCategoriesByName(name);
    }
}
