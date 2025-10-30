package com.ahc.springPractica.repositories;

import com.ahc.springPractica.entities.Order;
import com.ahc.springPractica.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRespository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerId(Long customerId);
    List<Order> findByProductId(Long productId);

}
