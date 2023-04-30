package co.istad.springminiproject.service.serviceImpl;

import co.istad.springminiproject.model.Category;
import co.istad.springminiproject.repository.CategoryRepository;
import co.istad.springminiproject.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    CategoryRepository categoryRepository;
    CategoryServiceImpl() {
        categoryRepository = new CategoryRepository();
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.getAllCategory();
    }

    @Override
    public List<Category> getALlCategoryByName(String name) {
        return categoryRepository.getAllCategory();
    }
}

