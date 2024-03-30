package com.java.democlass;
import java.util.Scanner; 
//Definition: It is defined by an single base class can have multiple subclasses and they can be easily accessed.
class Principle {
	void disp() {
		System.out.println("This is an Management office room");
	}
}
class Hod extends Principle{
	void display() {
		System.out.println("They are worked under principle guidance");
	}
}
class Staff extends Hod {
	void displays() {
		System.out.println("They are staff can be worked under Hod guidance");
	}
}
class Asst extends Hod{
	void displayss() {
		System.out.println("They are also worked under the principle guidance");
	}
}
public class Hierarchicalinhert {

	public static void main(String[] args) {
		Hod p1=new Hod();
		Staff s1=new Staff();
		Asst a1=new Asst();
		p1.disp();
		p1.display();
		s1.displays();
		a1.displayss();
		
		
		
		
		
		
		
		
	}

}
