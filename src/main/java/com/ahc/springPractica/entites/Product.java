package com.ahc.springPractica.entites;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "id_category")
    private Category category;



}
