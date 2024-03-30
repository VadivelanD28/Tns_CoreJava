package Myproject;
import java.io.*;
import java.util.Scanner;
public class Singleinheritance {
	public static void dis()
	{
		System.out.println("Hii Hello !!!");
	}
	
	
public static void main (String[] args)
{
	y obj=new y();
	obj.dis();
	obj.disp();
	obj.display();
     
}
	
}


class x extends Singleinheritance
{
	public static void disp()
	{
		System.out.println("Guys");
	}
}
class y extends x
{
public static void display()
{
	System.out.println("How are you !!!");
	
}
}
