package Myproject;
import java.io.*;
import java.util.Scanner;
public class overriding {
public static void print(int a)
{
	System.out.println("The given first value is "+a);
}
public static void print(int b, int c)
{
	System.out.println("The given second value is "+(b+c));
}
public static void print(int x, int y, int z)
{
    System.out.println("The given third value is "+(x*y*z));
}
public static void main(String[] args)
{
	  Abc obj=new Abc();
      obj.print(500);
      obj.print(20*30);
      obj.print(20*30*40);
      
}
}
class Abc extends overriding
{
	public static void print(int a)
	{
		System.out.println("The Inheritance given first value is ");
	}
	public static void print(int b, int c)
	{
		System.out.println("The Inheritance given second value is ");
	}
	public static void print(int x, int y, int z)
	{
	    System.out.println("The Inheritance given third value is ");
	}
}