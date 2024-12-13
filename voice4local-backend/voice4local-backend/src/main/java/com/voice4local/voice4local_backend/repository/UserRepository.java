package com.voice4local.voice4local_backend.repository;
import com.voice4local.voice4local_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
