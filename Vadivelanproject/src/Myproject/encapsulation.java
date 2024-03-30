package Myproject;
import java.io.*;
import java.util.Scanner;

class encapsulation
{
int id;
encapsulation(int a)
{
	this.id=a;//this.dot
}
void show()
{
	System.out.println("HELLO EVERYONE!!!");
}


	public static void main(String[] args)
	{
		encapsulation z=new encapsulation(5000);
		z.show();
		System.out.println("This is an this dot and this of keywords in java");
	}
	
}