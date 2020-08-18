package com.example.spring_data_rest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepo extends JpaRepository<Customers, Integer> {
    
}