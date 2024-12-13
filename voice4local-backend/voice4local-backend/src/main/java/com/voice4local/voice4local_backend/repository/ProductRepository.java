package com.voice4local.voice4local_backend.repository;

import com.voice4local.voice4local_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByServiceProviderId(Long serviceProviderId);
}