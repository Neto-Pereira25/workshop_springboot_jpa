package com.joseneto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseneto.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
