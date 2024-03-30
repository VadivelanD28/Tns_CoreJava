package Myproject;
import java.io.*;
import java.util.Scanner;
class Employee
{
	//class name and constructor are must be same
	//constructor creation
	private String empname;
	private int empid;
	//Here we want to create constructor below
	Employee()//Default constructor
	{
		System.out.println("It is an Default constructor ");
		//value initialization in constructor
		empname="Vadivelan";
		empid=1000;
	}
	
	
	//method creation
	
	void Employeeinfo()//method 
	{
		System.out.println("Employee Name: " +empname);
		System.out.println("Employee ID: " +empid);
	}


	public String getSalary() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
// This is an main class of an program
public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee a=new Employee();//calling constructor
a.Employeeinfo();
	}

}
