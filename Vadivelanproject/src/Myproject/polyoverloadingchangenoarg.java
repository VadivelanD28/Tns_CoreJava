package Myproject;
import java.io.*;
import java.util.Scanner;
public class polyoverloadingchangenoarg {
	public static void print()
	{
		System.out.println("HI HELLO EVERY ONE");
	}
public static void print(int a)
{
	System.out.println("The given value is "+a);
}
public static void print(int a, int b)
{
	System.out.println("The Addition value is "+(a+b));
	
}
public static void print(int a, int b, int c)
{
	System.out.println("The given values are in overloading");
}
public static void main(String[] args)
{
	print();
	print(100);
	print(50,100);
	print(10,20,30);
}
}
