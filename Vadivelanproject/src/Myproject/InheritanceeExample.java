package Myproject;
import java.io.*;
import java.util.Scanner;
public class InheritanceeExample {
	public static void dis()
	{
		System.out.println("Java inheritance code has been started");
	}
	
	
	public static void main (String[] args)
	{
		b h=new b();
		
		h.dis();
		h.disp(); 
	}
}

	class b extends InheritanceeExample
	{
		public static void disp()
		{
		System.out.println("End of the program");
	}
	}
	