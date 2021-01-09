package com.lti.CaseStudy;
import java.util.*;
public class Student1 {
	

	class Student{
		private int id;
		private String name;
		private String dob;
		Student(int id,String name,String dateofbirth){
			this.id=id;
			this.name=name;
			this.dob=dateofbirth;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDateofbirth() {
			return dob;
		}
		public void setDateofbirth(String dateofbirth) {
			this.dob = dateofbirth;
		}
	}

	class Info extends Student{
		Info(int id, String name, String dateofbirth) {
			super(id, name, dateofbirth);
			// TODO Auto-generated constructor stub
		}

		public void display(Student student) {
			System.out.println("Student id:"+this.getId());
			System.out.println("Student name:"+this.getName());
			System.out.println("Student dob:"+this.getDateofbirth());
		}
		
		public void display1(Course course) {
			System.out.println("Student id:"+course.getId());
			System.out.println("Student name:"+course.getName());
			System.out.println("Student course duration :"+course.getDuration());
			System.out.println("Student course fees :"+course.getFees());

			
		}
		
	}
	class Course{
			// TODO Auto-generated constructor
		private  int id;
		private String name;
		private String duration;
		private String fees;
		
		Course(int id,String name,String duration,String fees){
			this.id=id;
			this.name=name;
			this.duration=duration;
			this.fees=fees;
		}

		public  int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getFees() {
			return fees;
		}

		public void setFees(String fees) {
			this.fees = fees;
		}
		
		
	}

	public class App {

		public void scenario1() {
			Info obj = new Info(1,"Aadish","16-05-1998");
			obj.display(obj);	
			Info ob2 = new Info(2,"Bhavish","22-05-2000");
			ob2.display(ob2);	
		}
		
		public void scenario2() {
			Info[] arr = new Info[2];
			
			arr[0] = new Info(3, "Rahul","20-Feb"); 
			arr[1] = new Info(4, "Rakesh","29-Aug"); 
			
			arr[0].display(arr[0]);
			arr[1].display(arr[1]);
		}
		
		public void scenario3(int i,String s,String d) {
			Info[] arr = new Info[2];
			
			arr[0] = new Info(i, s,d); 
			arr[0].display(arr[0]);
		}
		
		
		
		public  void main (String[] args){
			Scanner sc = new Scanner(System.in);
		App ob1 = new App();
		ob1.scenario1();
		ob1.scenario2();
		
		System.out.print("Enter count of students");
		int j=sc.nextInt();
		for(int count=0;count<j;count++) {
			System.out.println("enter student id");
			int i=sc.nextInt();
			System.out.println("enter student name");
			String s=sc.next();
			System.out.println("enter student dob:");
			String d=sc.next();
			ob1.scenario3(i,s,d);
		}
		Course ab= new Course(501,"CHIRAG","08 Dec","55000");

		
		}
	
}
}

