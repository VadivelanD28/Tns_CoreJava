package com.java.democlass;
class Bikeshowroom{
	String Bikename="NINJA";
	String NewBike="APRILLA";
	public void disp() {
		System.out.println("NEW BIKE NAME IS "+ NewBike);
		
		System.out.println("This is my first bike showroom");
		System.out.println("BIKE NAME IS "+ Bikename);
		}

class Carshowroom extends Bikeshowroom{
	public void display() {
	System.out.println("This is my carshowroom");
}}
class Raja extends Carshowroom{
	public void displays() {
		System.out.println("This is my flightshowroom");
	}
}
}
public class Multiinheritance {

	public static void main(String[] args) {
		 Raja f1= new Raja();
		 f1.disp();
		 f1.display();
		 f1.displays();
		
	}

}
