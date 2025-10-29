package com.ahc.springPractica.controller;

import com.ahc.springPractica.entites.Category;
import com.ahc.springPractica.service.serviceI.IServiceCategory;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor

public class CategoryController {
    private final IServiceCategory serviceCategory;

    @GetMapping
    public List<Category> getCategories() {
        return serviceCategory.getListCategory();
    }


    @GetMapping("/{id}")
    public Category getCategorybyid(@PathVariable  Long id) {
        return serviceCategory.getCategoryid(id);
    }

    @PostMapping
    public Category createCategory(@RequestBody  Category category) {
        return serviceCategory.createCategory(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id ,@RequestBody Category category) {
        return serviceCategory.updateCategory(id,category);
    }

    @DeleteMapping ("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        serviceCategory.deleteCategory(id);
    }





}
