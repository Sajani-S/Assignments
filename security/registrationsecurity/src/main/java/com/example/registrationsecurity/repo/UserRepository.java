package com.example.registrationsecurity.repo;

import com.example.registrationsecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}