package com.ahc.springPractica.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "customer")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100,nullable = false)
    private String name;

    @Column(length = 200)
    private String email;


    @OneToMany(mappedBy = "customer",orphanRemoval=true,cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Order> orders=new ArrayList<>();

}
