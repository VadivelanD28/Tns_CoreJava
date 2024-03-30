package com.java.democlass;
 class Flight{
	 //declaring instance variable
	String flgtname;
	int flgtnumber;
	// declaring static variable
	static String flightcompany;
	String employeename;
	
	// creating of constructor
	Flight()
	{
		flgtname="INDIGO";
		flgtnumber=1212;
		flightcompany="Indian airways";
		employeename="adavan";
		
	}
	// declaring a method
	void display() {
		System.out.println("COMPANY NAME IS "+flightcompany);
		System.out.println("FLIGHT NAME IS "+flgtname );
		System.out.println("FLIGHT NUMBER IS "+flgtnumber);
		System.out.println("EMPLOYEE NAME IS "+employeename);
	}
}
public class Statickeyword {

	public static void main(String[] args) {
		System.out.println("They where static keyword has been used");
          Flight f1=new Flight();
          
          f1.display();// only method has been called
          
	}

}
