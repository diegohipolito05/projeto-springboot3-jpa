package com.diegohipolito05.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegohipolito05.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
