package com.chitransh.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chitransh.app.model.Course;
import com.chitransh.app.repositories.CourseRepository;

@Service
public class CourseServiceImpl{
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	public Course createCourse(Course course) throws Exception {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	
	public Course updateCourse(Course course) throws Exception {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}


	public List<Course> getAllCourse() throws Exception {
		// TODO Auto-generated method stub
		return courseRepository.findAll();
	}

	
	public Course getCourseById(Long courseId) throws Exception {
		// TODO Auto-generated method stub
		return courseRepository.findOne(courseId);
	}

	public void deleteCourse(Long courseId) throws Exception {
		// TODO Auto-generated method stub
		courseRepository.delete(courseId);
	}

}
