package com.brian.vinne.service;

import com.brian.vinne.model.Subcategory;
import com.brian.vinne.repository.SubcategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SubcategoryImpl implements SubcategoryService {

    private final SubcategoryRepository subcategoryRepository;
    @Override
    public List<Subcategory> findAllSubCategories() {
        return subcategoryRepository.findAllSubCategories();
    }

    @Override
    public Subcategory findSubById(String id_sub) {
        return subcategoryRepository.findSubById(id_sub);
    }

    @Override
    public Subcategory addSubCategory(Subcategory subcategory) {
        return subcategoryRepository.addSubCategory(subcategory);
    }

    @Override
    public Subcategory updateSubCategory(Subcategory subcategory) {
        return subcategoryRepository.updateSubCategory(subcategory);
    }

    @Override
    public List<Subcategory> deleteSubCategory(String id_sub) {
        return subcategoryRepository.deleteSubCategory(id_sub);
    }
}
