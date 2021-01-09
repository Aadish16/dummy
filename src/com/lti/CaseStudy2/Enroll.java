package com.lti.CaseStudy2;
import com.lti.CaseStudy.Student;

import java.time.LocalDate;

import com.lti.CaseStudy.Course;
public class Enroll {
	private Student student;
	private Course course;
	private LocalDate enrollmentDate ;
	
	Enroll(Student student, Course course, LocalDate enrollmentDate){
		this.student = student;
		this.course = course;
		this.enrollmentDate = enrollmentDate;
	}
	
	public Enroll() {
		
	}

	public Student getStudent() {
		return student;
	}
	public Course getCourse() {
		return course;
	}
	public LocalDate getEnrollmentDate() {
		return enrollmentDate;
	}
	
	
	public void setStudent( Student student ) {
		this.student =student; 
		
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public void setEnrollmentDate(LocalDate enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
}


