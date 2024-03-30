package com.java.democlass;
import java.util.Scanner;
import java.io.*;
class student{
	public String studentname="VADIVELAN D";  // variable 
	public String studentdep="B.Tech IT";
	public int studentmarks=500;
	public float studentpercentage=90.3f;
	
	void students() {
		System.out.println("You are eligible for Gold meadalist");   // method 
	}
    void studenttopper() {
    	System.out.println("University first Rank");
    }
}

public class classobjectdemo {

	public static void main(String[] args) {
		System.out.println("cultural program has been started");
		//student s1; // reference variable
		//new student();
		student s1=new student();
		s1.students();
		s1.studenttopper();
	}

}
