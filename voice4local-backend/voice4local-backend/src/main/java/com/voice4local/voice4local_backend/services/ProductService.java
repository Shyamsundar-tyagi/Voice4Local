package com.voice4local.voice4local_backend.services;
import com.voice4local.voice4local_backend.model.Product;
import com.voice4local.voice4local_backend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getProductsByShop(Long serviceProviderId) {
        return productRepository.findByServiceProviderId(serviceProviderId);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
}
