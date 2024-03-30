package com.java.democlass;
class car{                                  // class declaration
	public String carname="KIA";
	public String carmodel="x900";
	public int carprice=1500000;
	public String carowner="VADIVELAN";
	
	void disp() {                      // method declaration
		System.out.println("Car Name is "+ carname);
	}
	void display() {
		System.out.println("Car Model is "+ carmodel);
	}
	void dispp() {
		System.out.println("Car Price is "+ carprice);
	}
	void displays() {
		System.out.println("Car Owner is "+ carowner);
	}
}
public class classobjects {

	public static void main(String[] args) {
		System.out.println("Car Owner is Mr. Vadivelan D"); 
		car c1=new car();  // creating object to call the class
		c1.disp();
		c1.display();
		c1.dispp();
		c1.displays();
		
	}

}
