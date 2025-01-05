package com.joseneto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joseneto.course.entities.OrderItem;
import com.joseneto.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
