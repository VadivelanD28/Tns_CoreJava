package com.java.democlass;
class Collector{
	public static void disp() { // Here we are declare static method
		System.out.println("Mr.VADIVELAN D is an new collector of Tvm District");
	}
}
class Deputycollector extends Collector{
	public  static void display() {
		System.out.println("He is now working an Deputy collector of vellore");
	}
}
class Thasildhar extends Deputycollector{
	public  static void displayss() {
		System.out.println("And he also qualified for thasildhar post");
	}
	// Here Like that we are create many more class and methods using static method
}
public class Staticmethod {

	public static void main(String[] args) {
		//Deputycollector d1=new Deputycollector();
		Thasildhar t1=new Thasildhar();
		t1.disp();
		t1.display();
        t1.displayss();
	}

}
