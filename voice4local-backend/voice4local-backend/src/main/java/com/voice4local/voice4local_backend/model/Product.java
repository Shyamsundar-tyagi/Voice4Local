package com.voice4local.voice4local_backend.model;
import jakarta.persistence.*;
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private double price;
    private int stock;
    private String description;

    @ManyToOne
    @JoinColumn(name = "serviceProviderId")
    private ServiceProvider serviceProvider;

    // Getters and Setters
}
