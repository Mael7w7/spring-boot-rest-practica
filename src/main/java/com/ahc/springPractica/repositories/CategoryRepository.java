package com.ahc.springPractica.repositories;

import com.ahc.springPractica.entites.Category;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
