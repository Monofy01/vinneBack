package com.brian.vinne.controller;

import com.brian.vinne.model.SubcategoryItem;
import com.brian.vinne.service.SubcategoryItemService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subcategoryItem")
@AllArgsConstructor
public class SubcategoryItemController {

    private final SubcategoryItemService subcategoryItemService;

    @GetMapping("/all")
    public ResponseEntity<List<SubcategoryItem>> getAllSubItemCategories() {
        return new ResponseEntity<>(subcategoryItemService.findAllSubItemCategories(), HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<SubcategoryItem> getSubItemCategoryById(@PathVariable("id") String id) {
        SubcategoryItem subcategoryItem = subcategoryItemService.findSubItemById(id);
        return new ResponseEntity<>(subcategoryItem, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<SubcategoryItem> addSubItemCategoryy(@RequestBody SubcategoryItem subcategoryItem) {
        SubcategoryItem addSubItemCategory = subcategoryItemService.addSubItemCategory(subcategoryItem);
        return new ResponseEntity<>(addSubItemCategory, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<SubcategoryItem> updateSubItemCategory(@RequestBody SubcategoryItem subcategoryItem) {
        SubcategoryItem updateSubItemCategory = subcategoryItemService.updateSubItemCategory(subcategoryItem);
        return new ResponseEntity<>(updateSubItemCategory, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<List<SubcategoryItem>> deleteSubItemCategory(@PathVariable String id) {
        return new ResponseEntity<>(subcategoryItemService.deleteSubItemCategory(id), HttpStatus.OK);
    }
}
