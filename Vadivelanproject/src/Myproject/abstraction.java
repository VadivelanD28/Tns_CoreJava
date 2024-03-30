package Myproject;
import java.io.*;
import java.util.Scanner;
// abstraction class creation
abstract class myproject{
	
//************************************************************	
	//abstract method creation
	abstract void display();
//**********************************************************
	
	// Normal method creation
	void myprg() {
		System.out.println("The abstraction program are started !!! ");
	}
}
//subclass creation for implementing abstract method 
class add extends myproject{

	void display() {
		System.out.println("Aspirants are started to preparing !!!");
		
	}
	
}
// main block creation 
public class abstraction {

	public static void main(String[] args) {
		// object creation part 
		add d=new add();
		// object calling part
		
		d.myprg();
		d.display();
		

	}

}
