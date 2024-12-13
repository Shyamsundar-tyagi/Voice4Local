package com.voice4local.voice4local_backend.model;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String name;
    private String email;
    private String password;
    private String role; // 'customer' or 'admin'

    // Getters and Setters
}
