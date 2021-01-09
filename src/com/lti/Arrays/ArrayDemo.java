package com.lti.Arrays;

class Employee{
	private int empno;
	private String name;
	
	Employee(int empno, String name)
	{
		this.empno=empno;
		this.name=name;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int Empno, int empno) {
		this.empno= empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name, String name) {
		this.name=name;
	}
}
public class ArrayDemo{
	public static void main(String[]args) {
		Employee emp[];
		emp= new Employee[3];
		emp[0]= new Employee(101,"ram");
		emp[1]=new Employee(102,"Shyam");
		emp[2]= new Employee(103,"Raju");
		
		System.out.println("Details are:");
		
		for(int x=0; x<emp.length; x++)
		{
			System.out.println("EmpNo:" +emp[x].getEmpno()  +  "Name:" +emp[x].getName());
		}
		
	}
}