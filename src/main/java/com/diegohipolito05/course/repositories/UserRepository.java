package com.diegohipolito05.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diegohipolito05.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
