package com.java.democlass;
// Definition: Hiding the implementation details of code and exposing only the necessary information
//            to the user 
// they are classified into two types they are:
//          * abstract class 
//          * abstract method
abstract class Empolyee
{
	// A abstract class can have one abstract method 
	abstract void display(); // we can only use only declaration in abstraction
	void show() 
	{
		System.out.println("Abstract show");
	}
}
class Servent extends Employee{
	void display()
	{
		System.out.println("This is an derived class");
	}
}
public class Abstraction {

	public static void main(String[] args) {
       Servent obj= new Servent();
       obj.display();
       
	}

}
