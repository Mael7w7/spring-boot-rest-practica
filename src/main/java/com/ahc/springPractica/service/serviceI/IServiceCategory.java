package com.ahc.springPractica.service.serviceI;

import com.ahc.springPractica.entites.Category;

import java.util.List;

public interface IServiceCategory {
    List<Category> getListCategory(); //para lista las categorias
    Category createCategory(Category category); // creqmos una categoria nueva
    Category updateCategory(Long id,Category category);//Actualizamos la categoria
    void deleteCategory(Long id); //eliminamos una categoria
    Category getCategoryid(Long id);



}
