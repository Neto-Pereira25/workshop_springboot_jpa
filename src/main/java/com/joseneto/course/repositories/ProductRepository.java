package com.joseneto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseneto.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
