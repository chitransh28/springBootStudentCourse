package com.chitransh.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.chitransh.app.model.Student;
import com.chitransh.app.repositories.StudentRepository;

@Service
public class StudentServiceImpl  {

	@Autowired
	private StudentRepository studentRepository;
	
	public Student createStudent(Student student) throws Exception {
		
		return studentRepository.save(student);
	}

	
	public Student updateStudent(Student student) throws Exception {
		
		return studentRepository.save(student);
	}

	
	public List<Student> getAllStudent() throws Exception {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	
	public Student getStudentById(Long studentId) throws Exception {
		// TODO Auto-generated method stub
		return studentRepository.findOne(studentId);
	}

	
	public void deleteStudent(Long studentId) throws Exception {
		// TODO Auto-generated method stub
		
		studentRepository.delete(studentId);

	}

	/*@Override
	public List<Student> getStudentRegCourse(String courseId) throws Exception {
		// TODO Auto-generated method stub
		return studentRepository.findAllStudentRegCourse(courseId);
	}

	@Override
	public List<Student> getStudentRegMoreTwoCourse() throws Exception {
		// TODO Auto-generated method stub
		return studentRepository.findAllStudentRegMoreTwoCourse();
	}

	@Override
	public List<Student> getStudentLeavesTx(String studentAddress) throws Exception {
		// TODO Auto-generated method stub
		return studentRepository.findAllTxStudentNativeQuery();
	}*/

}
