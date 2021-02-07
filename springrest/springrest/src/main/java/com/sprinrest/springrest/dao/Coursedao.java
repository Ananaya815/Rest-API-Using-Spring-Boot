package com.sprinrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sprinrest.springrest.entities.Course;

public interface Coursedao extends JpaRepository<Course,Long>{

}
