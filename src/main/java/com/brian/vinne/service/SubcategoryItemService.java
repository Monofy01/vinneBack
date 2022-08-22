package com.brian.vinne.service;

import com.brian.vinne.model.SubcategoryItem;

import java.util.List;

public interface SubcategoryItemService {
    List<SubcategoryItem> findAllSubItemCategories();

    SubcategoryItem findSubItemById(String id_subItem);

    SubcategoryItem addSubItemCategory(SubcategoryItem subcategoryItem);

    SubcategoryItem updateSubItemCategory(SubcategoryItem subcategoryItem);

    List<SubcategoryItem> deleteSubItemCategory(String id_subItem);
}
