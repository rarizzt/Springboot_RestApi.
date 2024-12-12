package com.example.project.Models.repository;

import com.example.project.Models.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Long> {

    List<Product> findByNameContains(String name);
}
