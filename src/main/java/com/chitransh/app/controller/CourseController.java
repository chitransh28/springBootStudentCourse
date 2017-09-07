package com.chitransh.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chitransh.app.model.Course;
import com.chitransh.app.service.CourseServiceImpl;

@RestController
@RequestMapping("course")
public class CourseController {

	@Autowired
	private CourseServiceImpl courseService;
	
	@PostMapping
	public Course create(@RequestBody Course course) throws Exception{
		return courseService.createCourse(course);
	}
	
	@PutMapping
	public Course update(@RequestBody Course course) throws Exception{
		return courseService.updateCourse(course);
	}
	
	@GetMapping
	public List<Course> getAllCourse() throws Exception{
		return courseService.getAllCourse();
	}
	
	@GetMapping("/{courseId}")
	public Course getStudentById(@PathVariable("courseId") Long courseId) throws Exception{
		return courseService.getCourseById(courseId);
	}
	
	@DeleteMapping("/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable("courseId") Long courseId) throws Exception{
		courseService.deleteCourse(courseId);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	
}
