package Myproject;
import java.io.*;
import java.util.Scanner;
public class Hierarchical 
{
	public static void dis()
	{
		System.out.println("HAPPY MORNING ");
	}

}
class c extends Hierarchical{
	public static void disp()
	{
		System.out.println("GOOD AFTERNOON ");
	}
}
class d extends Hierarchical
{
	public static void display()
	{
	System.out.println("GOOD EVENING GUYS");
	}

public static void main(String[] args)
{
	c h=new c();
	d o=new d();
	h.dis();
	h.disp();
    o.display();
}}