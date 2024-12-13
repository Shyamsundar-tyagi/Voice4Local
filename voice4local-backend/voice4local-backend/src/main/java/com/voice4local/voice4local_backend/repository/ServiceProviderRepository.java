package com.voice4local.voice4local_backend.repository;
import com.voice4local.voice4local_backend.model.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, Long> {
}
