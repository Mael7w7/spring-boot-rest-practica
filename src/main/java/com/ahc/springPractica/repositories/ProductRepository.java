package com.ahc.springPractica.repositories;

import com.ahc.springPractica.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
