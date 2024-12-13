package com.voice4local.voice4local_backend.services;
import com.voice4local.voice4local_backend.model.ServiceProvider;
import com.voice4local.voice4local_backend.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceProviderService {
    @Autowired
    private ServiceProviderRepository repository;

    public List<ServiceProvider> getAllShops() {
        return repository.findAll();
    }
}
