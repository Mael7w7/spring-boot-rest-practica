package com.ahc.springPractica.service.serviceI;


import com.ahc.springPractica.entites.Category;
import com.ahc.springPractica.entites.Product;

import java.util.List;

public interface IServiceProduct {
    List<Product> getListProduct(); //para lista los productos
    List<Product> getProduct(Long idCategory);//buscar un productos por categoria
    Product createProduct(Product product); // creqmos una producto nueva
    Product updateProduct(Long id ,Product product);//Actualizamos la producto
    void deleteProduct(Long id); //eliminamos un producto


}
