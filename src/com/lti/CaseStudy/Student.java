
package com.lti.CaseStudy;

public class Student {

	private int id;
	private String name;
	private String dob;
	
	public Student ( int id , String name ,String dob) {
		this.id=id;
		this.name=name;
		this.dob=dob;
		
	}
	
	int getStudentID() {
		return id;
	}
	String getStudentname() {
		return name;
		
	}
	String getStudentdob() {
		return dob;
	}
	
	void setStudentID(int id) {
		this.id=id;
	
	}
	void setStudentname(String name) {
		this.name=name;
	}
	
	void setStudentdob(String dob) {
		this.dob=dob;
	}
	}

