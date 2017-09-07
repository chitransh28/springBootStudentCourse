package com.chitransh.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chitransh.app.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

	
}
