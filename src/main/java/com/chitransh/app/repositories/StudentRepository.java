package com.chitransh.app.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.chitransh.app.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    
/*	public Optional<Student> findByStudentName(String studentName);
	
	public List<Student> findDistinctByStudentName(String studentName);
	
	@Query(value="select * from student where studentAddress like '%Tx'", nativeQuery=true)
	public List<Student> findAllTxStudentNativeQuery();
	
	@Query(value = "select student.studentId, student.studentName, student.studentAddress from student inner join studentCourse on student.studentId = studentCourse.studentId where studentCourse.courseId = ?", nativeQuery = true)
	public List<Student> findAllStudentRegCourse(String courseId);
	
	@Query(value = "select student.studentId, student.studentName, student.studentAddress from student inner join studentCourse on student.studentId = studentCourse.studentId group by studentId, studentName, studentAddress having count(studentCourse.courseId)>2", nativeQuery = true)
	public List<Student> findAllStudentRegMoreTwoCourse();*/

}
