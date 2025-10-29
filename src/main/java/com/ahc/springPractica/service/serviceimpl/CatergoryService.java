package com.ahc.springPractica.service.serviceimpl;

import com.ahc.springPractica.entites.Category;
import com.ahc.springPractica.repositories.CategoryRepository;
import com.ahc.springPractica.service.serviceI.IServiceCategory;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data

public class CatergoryService implements IServiceCategory {

    private final CategoryRepository categoryRepository;

    @Override
    public List<Category> getListCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryid(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id ,Category category) {
        category.setId(id);
        return categoryRepository.save(category);

    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.deleteById(id);
    }
}
