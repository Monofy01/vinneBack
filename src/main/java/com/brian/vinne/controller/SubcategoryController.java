package com.brian.vinne.controller;

import com.brian.vinne.model.Category;
import com.brian.vinne.model.Subcategory;
import com.brian.vinne.service.CategoryService;
import com.brian.vinne.service.SubcategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subcategory")
@AllArgsConstructor
public class SubcategoryController {

    private final SubcategoryService subcategoryService;

    @GetMapping("/all")
    public ResponseEntity<List<Subcategory>> getAllSubCategories() {
        return new ResponseEntity<>(subcategoryService.findAllSubCategories(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Subcategory> getSubCategoryById(@PathVariable("id") String id) {
        Subcategory subcategory = subcategoryService.findSubById(id);
        return new ResponseEntity<>(subcategory, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Subcategory> addSubCategoryy(@RequestBody Subcategory subcategory) {
        Subcategory addSubCategory = subcategoryService.addSubCategory(subcategory);
        return new ResponseEntity<>(addSubCategory, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Subcategory> updateSubCategory(@RequestBody Subcategory subcategory) {
        Subcategory updateSubCategory = subcategoryService.updateSubCategory(subcategory);
        return new ResponseEntity<>(updateSubCategory, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<List<Subcategory>> deleteSubCategory(@PathVariable String id) {
        return new ResponseEntity<>(subcategoryService.deleteSubCategory(id), HttpStatus.OK);
    }
}

