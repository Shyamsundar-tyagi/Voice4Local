package com.voice4local.voice4local_backend.controller;
import com.voice4local.voice4local_backend.model.ServiceProvider;
import com.voice4local.voice4local_backend.services.ServiceProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/shops")
public class ServiceProviderController {
    @Autowired
    private ServiceProviderService serviceProviderService;

    @GetMapping
    public List<ServiceProvider> getAllShops() {
        return serviceProviderService.getAllShops();
    }
}
