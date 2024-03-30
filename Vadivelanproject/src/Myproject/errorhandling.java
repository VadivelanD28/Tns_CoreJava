package Myproject;
import java.io.*;
import java.util.Scanner;


public class errorhandling {
	
//Always write a code in main block
	//important point to be followed
	public static void main(String[] args) {
		try
		{
			int a=500,b=0,c=a/b;
			System.out.println(c);
			
		}
		
		catch(Exception e)
		{
			System.out.println("You Entered invalid number  by given conditions");
		}
		finally
		{
			System.out.println("The Exeception handling programing has been executed ");
		}

	}

}
