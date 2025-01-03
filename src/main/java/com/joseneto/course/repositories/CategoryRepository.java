package com.joseneto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseneto.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
