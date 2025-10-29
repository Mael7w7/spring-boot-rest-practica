package com.ahc.springPractica.service.serviceimpl;

import com.ahc.springPractica.entites.Category;
import com.ahc.springPractica.entites.Product;
import com.ahc.springPractica.repositories.ProductRepository;
import com.ahc.springPractica.service.serviceI.IServiceProduct;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data


public class ProductService implements IServiceProduct {
    private final ProductRepository productRepository;

    @Override
    public List<Product> getListProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getProduct(Long idCategory) {
        return productRepository.findByCategoryId(idCategory);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id ,Product product) {
        product.setId(id);
        return  productRepository.save(product);

    }

    @Override
    public void deleteProduct(Long id) {
         productRepository.deleteById(id);
    }
}
