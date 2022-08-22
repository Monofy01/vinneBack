package com.brian.vinne.service;

import com.brian.vinne.model.SubcategoryItem;
import com.brian.vinne.repository.SubcategoryItemRepository;
import com.brian.vinne.repository.SubcategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubcategoryItemImpl implements SubcategoryItemService {

    private final SubcategoryItemRepository subcategoryItemRepository;


    @Override
    public List<SubcategoryItem> findAllSubItemCategories() {
        return subcategoryItemRepository.findAllSubItemCategories();
    }

    @Override
    public SubcategoryItem findSubItemById(String id_subItem) {
        return subcategoryItemRepository.findSubItemById(id_subItem);
    }

    @Override
    public SubcategoryItem addSubItemCategory(SubcategoryItem subcategoryItem) {
        return subcategoryItemRepository.addSubItemCategory(subcategoryItem);
    }

    @Override
    public SubcategoryItem updateSubItemCategory(SubcategoryItem subcategoryItem) {
        return subcategoryItemRepository.updateSubItemCategory(subcategoryItem);
    }

    @Override
    public List<SubcategoryItem> deleteSubItemCategory(String id_subItem) {
        return subcategoryItemRepository.deleteSubItemCategory(id_subItem);
    }
}
