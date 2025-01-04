package com.joseneto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseneto.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
