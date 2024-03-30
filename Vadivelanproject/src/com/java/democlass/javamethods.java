package com.java.democlass;
class Employee{
	Employee()   // constructor creation
	{
		System.out.println("Employee deatils");
	}
    Employee(String name)  // another constructor creation
    {
    	System.out.println("Employee name "+name);
    }
    Employee(int ID) // we can create multiple constructor is called constructor overloading
    {
    	System.out.println("Employee ID "+ID);
    }
    Employee(double salary)
    {
    	System.out.println("Employee Salary "+salary);
    }
}

public class javamethods {

	public static void main(String[] args) {
		Employee e1=new Employee("Assistant Manager");
		Employee e2=new Employee("VADIVELAN"); // creating different object to call the constructor
		Employee e3=new Employee(5000000);
		Employee e4=new Employee(122.34);
	}

}
