package com.ahc.springPractica.services.iservice;

import com.ahc.springPractica.entities.Product;

import java.util.List;

public interface IServiceProduct {
    List<Product> lisProducts (); //listar productos
    Product getProductById(Long id); // buscar producto por id
    Product createProduct(Product product);//Crear producto
    Product updateProduct(Long id ,Product product); //Actualizar producto por id
    void deleteProduct(Long id);

}
