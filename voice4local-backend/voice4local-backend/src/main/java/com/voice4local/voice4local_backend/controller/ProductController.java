package com.voice4local.voice4local_backend.controller;
import com.voice4local.voice4local_backend.model.Product;
import com.voice4local.voice4local_backend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(@RequestParam Long shopId) {
        return productService.getProductsByShop(shopId);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}
