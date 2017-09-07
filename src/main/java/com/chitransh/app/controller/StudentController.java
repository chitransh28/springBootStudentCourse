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

import com.chitransh.app.model.Student;
import com.chitransh.app.repositories.StudentRepository;

import com.chitransh.app.service.StudentServiceImpl;

@RestController
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentServiceImpl studentService;
	
	@PostMapping
	public Student create(@RequestBody Student student) throws Exception{
		Student s2 = new Student();
		s2.setStudentId(9l);
		s2.setStudentAddress("NY");
		s2.setStudentName("Chitransh");
		
		
		 
				Student s = studentService.createStudent(student);
				
				
				return s;
	} 	
	
	@PutMapping
	public Student update(@RequestBody Student student) throws Exception{
		return studentService.updateStudent(student);
	}
	
	@GetMapping
	public List<Student> getAllStudent() throws Exception{
		 List<Student> students = studentService.getAllStudent();
		 return students;
	}
	
	@GetMapping("/{studentId}")
	public Student getStudent(@PathVariable("studentId") Long studentId) throws Exception{
		return studentService.getStudentById(studentId);
		
	}
	
	@DeleteMapping("/{studentId}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("studentId") Long studentId) throws Exception{
		studentService.deleteStudent(studentId);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	/*//@GetMapping("/{courseId}")
	public List<Student> getStudentRegCourse(@PathVariable("courseId") String courseId) throws Exception{
		List<Student> student = studentService.getStudentRegCourse(courseId);
		return student;
	}
	
	//@GetMapping()
	public List<Student> getStudentRegTwoCourse() throws Exception{
		List<Student> student = studentService.getStudentRegMoreTwoCourse();
		return student;
	}
	
	//@GetMapping("/{studentaddress}")
	public List<Student> getStudentTx(@PathVariable("studentAddress") String studentAddress) throws Exception{
		List<Student> student = studentService.getStudentLeavesTx(studentAddress);
		return student;
	}*/
}
