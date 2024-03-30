package Myproject;
import java.io.*;
import java.util.Scanner;
class aspirant
{
	String aspname;
    int aspmark;
	aspirant()
	{
	    System.out.println("The UPSC CIVIL SERVICE RESULT ANNOUNCED ");
		aspname="VADIVELAN.D";
		aspmark=15;
	}
	void aspirantinfo()
	{
      System.out.println("The Aspirant Name is : "+aspname);
      System.out.println("The Aspirant Rank is : "+aspmark);
      
	}
}
public class vadiconstructor {

	public static void main(String[] args) {
		aspirant v=new aspirant();
		v.aspirantinfo();

	}

}
