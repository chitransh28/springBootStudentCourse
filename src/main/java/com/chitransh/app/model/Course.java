package com.chitransh.app.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnore;


/*
@Data
@NoArgsConstructor
@AllArgsConstructor*/
@Entity
@Table(name = "Course")
// @XmlRootElement
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long courseId;
	private String courseName;


	@ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, targetEntity = Student.class)
	@JoinTable(name = "Student_Course", joinColumns = {@JoinColumn(name = "courseId", nullable = false) }, inverseJoinColumns = {@JoinColumn(name = "studentId	", nullable = false) })
	@JsonIgnore
	private List<Student> student = new ArrayList<>();

	public Course() {
		super();
	}

	public Course(Long courseId, String courseName) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		//this.versionId = versionId;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	

}