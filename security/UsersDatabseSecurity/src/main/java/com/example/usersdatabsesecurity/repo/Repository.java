package com.example.usersdatabsesecurity.repo;

import com.example.usersdatabsesecurity.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Users, Integer> {

    Users findByUsername(String username);

}