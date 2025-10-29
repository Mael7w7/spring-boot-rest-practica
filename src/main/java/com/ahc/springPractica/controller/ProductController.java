package com.ahc.springPractica.controller;

import com.ahc.springPractica.entites.Category;
import com.ahc.springPractica.entites.Product;
import com.ahc.springPractica.service.serviceI.IServiceProduct;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
    private final IServiceProduct serviceProduct;

    @GetMapping
    public List<Product> getProducts() {
        return serviceProduct.getListProduct();
    }

    @GetMapping("/category/{categoryid}")
    public List<Product> getCategoryById(@PathVariable Long categoryid) {
        return serviceProduct.getProduct(categoryid);
    }

    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return serviceProduct.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return serviceProduct.updateProduct(id, product);
    }


    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        serviceProduct.deleteProduct(id);
    }

}
