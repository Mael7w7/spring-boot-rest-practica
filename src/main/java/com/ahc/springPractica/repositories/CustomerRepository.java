package com.ahc.springPractica.repositories;

import com.ahc.springPractica.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
