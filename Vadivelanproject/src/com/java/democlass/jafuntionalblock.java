package com.java.democlass;

public class jafuntionalblock {
	// here below functional block has been created
	
  public static void print() // functional block creating syntax 
  {    
	  int a=100;
	  int b=250;   
	  int Sum=a+b;
	  System.out.println("The sum of value is "+ Sum);
  }
  public static void prints()
  {    int a=200;
       int b=400;
       int Subraction=a-b;
	  System.out.println("The subraction of value is "+ Subraction);
  }
  public static void display(String a)
  {
	 System.out.println("The given stirng is "+a);
	 
  }
  
  // This is an mainblock
	public static void main(String[] args) {
		print();prints();display("VADIVELAN"); // calling method
		System.out.println("Welcome to java programming");

	}

}
