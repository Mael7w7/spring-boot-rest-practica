package com.ahc.springPractica.entites;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 100)
    private String name;

    @Column(nullable = false,length=300)
    private String description;

    @OneToMany(mappedBy ="category", cascade = CascadeType.ALL,orphanRemoval = true)
    List<Product> products;



}
