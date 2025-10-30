package com.ahc.springPractica.services.serviceImpl;

import com.ahc.springPractica.entities.Product;
import com.ahc.springPractica.repositories.ProductRepository;
import com.ahc.springPractica.services.iservice.IServiceProduct;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Data
@Builder
public class ProductService implements IServiceProduct {
    private final ProductRepository productRepository;



    @Override
    public List<Product> lisProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        product.setId(id);
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
       productRepository.deleteById(id);
    }
}
