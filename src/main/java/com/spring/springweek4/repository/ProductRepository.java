package com.spring.springweek4.repository;

import com.spring.springweek4.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
