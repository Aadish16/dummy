/*
package com.lti.CaseStudy;
import java.util.Scanner;
public class App {
	public void scenario1() {
		Student s1= new Student(1,"Aadish","1998-04-20");
		Student s2= new Student(2,"Bhavish","2000-07-21");
		Student s3= new Student(3,"Rahul","1995-10-22");
	}
public void scenario2() {
	
	Student[] students= new Student[3];
	students[0]= new Student(1,"Aadish2","1998-04-20");
	students[0]= new Student(2,"Bhavish2","2000-07-21");
	students[0]= new Student(3,"Rahul2","1995-10-22");
	
	for(int i=0; i<3; i++) {
		new Info().display(students[i]);
	}
}
	public void scenario3() {
		Scanner sc= new Scanner(System.in);
		System.out.println("ID: ");
		int id=sc.nextInt();
		System.out.println("Name: ");
		String name= sc.next();
		System.out.println("DOB: ");
		
	String dob= sc.next();
	Student student = new Student(id,name,dob);
	}
	public static void main(String[] args) {
}
}

[2:58 PM, 12/4/2020] Ritik Gupta: package com.lti.casestudy;


public class ClassInfo{
	
	void display(Student student) {
		System.out.println("This is the student ID" +student.getStudentID());

		System.out.println("This is the student Name" +student.getStudentName());

		System.out.println("This is the student Dob" +student.getStudentDOB());
	}
	
	void display(Course course) {
		System.out.println("This is the course ID" +course.getCourseID());

		System.out.println("This is the course Name" +course.getCourseName());

		System.out.println("This is the course Dob" +course.getCourseDuration());

		System.out.println("This is the course Dob" +course.getCourseFees());
	}
}*/
package com.lti.CaseStudy;

import java.util.Scanner;

public class App{
	
	void scenario1 () {
		Student stud1 = new Student(100,"AADISH JAIN","16-MAY-1998");
		Classinfo info = new Classinfo();
		info.display(stud1);
		System.out.println("Scenario 1 Ends" );
	}
	
	
	void scenario2 () {
		
		Student [] stud = new Student[10];
		stud[0] =  new Student(101,"Chirag vijayvargiya","08-DEC-2000");
		stud[1] =  new Student(102,"Ayush Khasgiwala","24-FEB-1999");
		stud[2] =  new Student(103,"Vishakha Gupta","29-AUG-1999");
		stud[3] =  new Student(104,"Sakshi Arora","23-OCT-1998");
		
		Classinfo info = new Classinfo();
		
		for (int i=0 ; i<stud.length; i++) {
			if (stud[i]!= null)
				info.display(stud[i]);
		}
		System.out.println("Scenario 2 Ends" );
	}
	
	
	void scenario3() {
		String input = "y";
		int count = 0;
		Student [] stud = new Student[10];
		while( true )
		{
			if (input.equals("y")) {
				@SuppressWarnings("resource")
				Scanner sc =  new Scanner(System.in);
				System.out.println("Enter student ID" );
				int id = sc.nextInt();
				System.out.println("Enter student Name" );
				String name = sc.next();
				System.out.println("Enter student DOB ");
				String dob = sc.next();
				
				stud[count] = new Student(id,name,dob);
				count++;
				
				System.out.println("Do you want to continue??Enter Y for continuing, else press any key:" );
				input = sc.next();
			}	
				else
					break;
			
		}
		Classinfo info = new Classinfo();
		
		for (int i=0 ; i<stud.length; i++) {
			if(stud[i]!=null)
				info.display(stud[i]);
		}
		System.out.println("Scenario 3 Ends" );
	}
	
	public static void main(String []args) {
		
		App app= new App();
		app.scenario1();
		app.scenario2();
		app.scenario3();
	}
}