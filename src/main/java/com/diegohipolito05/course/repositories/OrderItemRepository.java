package com.diegohipolito05.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegohipolito05.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
