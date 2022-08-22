package com.brian.vinne.service;

import com.brian.vinne.model.Category;
import com.brian.vinne.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAllCategories();
    }

    @Override
    public Category findCatById(String id_cat) {
        return categoryRepository.findCatById(id_cat);
    }

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.addCategory(category);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.updateCategory(category);
    }

    @Override
    public List<Category> deleteCategory(String id_cat) {
        return categoryRepository.deleteCategory(id_cat);
    }


}
