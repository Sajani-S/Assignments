package com.example.productmanagementrest.repository;


import com.example.productmanagementrest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface Productrepository extends JpaRepository<Product,Integer> {









}
