package com.diegohipolito05.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegohipolito05.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
