package com.java.democlass;
class fashion{                 // they are mainly classified three types inheritance
	                           // 1. single inheritance 
	                           // 2. Multilevel inheritance
	                           // 3. Hierarchical inheritance
	                       // Multiple inheritance are not supported in java
		String Shop="Marvelous Menswear"; 
		String Location="Chennai";
		int Pincode=600123;
	
	void display() {
		System.out.println("Shop");
		System.out.println("Location");
		System.out.println("Pincode");
	}
}
class Mens extends fashion
{
	void Showdetails() 
	{
		System.out.println("T-shirts,Jeans, Pants");
	}

public class singleinherit {

	public static void main(String[] args) {
		Mens w1=new Mens();
		w1.Showdetails();
	}
}
}

