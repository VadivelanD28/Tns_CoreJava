package Myproject;
import java.io.*;
import java.util.Scanner;
public class polyoverloadingchangedatatypes {
	public static void print(int a)
	{
		System.out.println("The Intege value is "+a);
	}
	public static void print(double a)
	{
		System.out.println("The Double value is "+a);
	}
	
	public static void main(String[] args)
	{
		print(500);
		print(20.83);
		
	}
}
