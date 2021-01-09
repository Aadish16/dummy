package com.lti.CaseStudy;

public class Course {
	private int id ;
	private String name;
	private int duration;
	private int fees ;
	
	public Course (int id , String name , int duration, int fees) {
		this.id = id;
		this.name = name;
		this.duration = duration;
		this.fees = fees;
	}
	
	int getCourseID() {
		return id;
	}
	String getCourseName() {
		return name;
	}
	int getCourseDuration() {
		return duration;
	}
	int getCourseFees() {
		return fees;
	}
	
	
	void setCourseID( int id) {
		this.id =id ;
	}
	void setCourseName(String name) {
		this.name = name;
	}
	void setCourseDuration(int duration) {
		this.duration = duration;
	}
	void setCourseFees(int fees) {
		this.fees = fees;
	}
}

