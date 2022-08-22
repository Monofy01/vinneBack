package com.brian.vinne.service;

import com.brian.vinne.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAllCategories();

    Category findCatById(String id_cat);

    Category addCategory(Category category);

    Category updateCategory(Category category);

    List<Category> deleteCategory(String id_cat);
}
