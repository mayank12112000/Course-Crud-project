package com.springrest.springrest.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.model.Course;

import jakarta.persistence.Entity;

public interface CourseDao extends JpaRepository<Course, Long> {
	
}
