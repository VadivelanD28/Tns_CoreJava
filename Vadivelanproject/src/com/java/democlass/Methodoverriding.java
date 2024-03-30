package com.java.democlass;
class Humans{
	// overridden method it means same method name
	public void display() {
		System.out.println("Hello");
	}
}    // parents class same as another class
class Boy extends Humans{
	 public void display() {
	System.out.println("He is eating an Icecream");
}}
class Girl extends Humans{
	// the parameters are must be same as the another given parameters
	public void display() {
		System.out.println("She is Eating an Lunch");
	}
}
class Stundents extends Humans{
	public  void display() {
		System.out.println("These peoples were eating their snacks");
	}
}
public class Methodoverriding {

	public static void main(String[] args) {
		Humans h1=new Humans();
		h1.display();
		//h1.display(); 
		
		

	}

}
