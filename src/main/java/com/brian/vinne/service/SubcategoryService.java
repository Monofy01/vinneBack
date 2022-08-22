package com.brian.vinne.service;

import com.brian.vinne.model.Category;
import com.brian.vinne.model.Subcategory;

import java.util.List;

public interface SubcategoryService {
    List<Subcategory> findAllSubCategories();

    Subcategory findSubById(String id_sub);

    Subcategory addSubCategory(Subcategory category);

    Subcategory updateSubCategory(Subcategory category);

    List<Subcategory> deleteSubCategory(String id_sub);
}


