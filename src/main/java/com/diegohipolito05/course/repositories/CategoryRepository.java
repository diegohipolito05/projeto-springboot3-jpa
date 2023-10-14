package com.diegohipolito05.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegohipolito05.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
