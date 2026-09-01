package com.example.inventoryrest.repo;


import com.example.inventoryrest.jpaentity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface Itemrepo extends JpaRepository<Item,Integer> {
}
