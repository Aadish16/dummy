package com.lti.CaseStudy2;
import com.lti.CaseStudy.Student;
import java.time.LocalDate;
import java.util.ArrayList;
import com.lti.CaseStudy.Course;

public class AppEngine {
	ArrayList<Student> studentList = new ArrayList<Student>(); 
	 ArrayList<Course> courseList = new  ArrayList<Course>();
	 ArrayList <Enroll> enrollList = new  ArrayList<Enroll>();
	 
	 public void introduce(Course course) {
		 this.courseList.add(course) ;
	    }

	 

	  public void register(Student student) {
		  this.studentList.add(student);
		 }

	  public ArrayList<Student> listOfStudents() {
		  return studentList;
	    }

	  public ArrayList<Course> listOfCourses() {
		  	return courseList;
	    }

	 public void enroll(Student student, Course course) {
		 enrollList.add(new Enroll(student,course,LocalDate.now()));
	    }
	 
	  public ArrayList<Enroll> listOfEnrollments() {
		  	return enrollList;

	    }
	  
}

