package com.ahc.springPractica.entites;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name="product")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private BigDecimal price;
    private Integer stock;

    //Relation de
    @ManyToOne
    @JoinColumn(name = "id_category")
    @JsonBackReference
    private Category category;



}
