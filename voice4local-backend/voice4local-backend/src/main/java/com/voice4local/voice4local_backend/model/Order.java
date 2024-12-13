package com.voice4local.voice4local_backend.model;
import jakarta.persistence.Entity;

import jakarta.persistence.*;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    private int quantity;
    private double totalAmount;
    private String orderStatus; // e.g., 'Pending', 'Shipped', 'Delivered'

    @ManyToOne
    @JoinColumn(name = "productId")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    // Getters and Setters
}
