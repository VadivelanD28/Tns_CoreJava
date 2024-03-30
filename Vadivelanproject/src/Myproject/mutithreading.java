package Myproject;
import java.io.*;
import java.util.Scanner;
//      Two  types of Multithreads they are
//     1. Multi thread class  syntax -- public class class_name extends Thread
//     2. Runnable interface  syntax --- public class class_name implements Runnable
//This is an multithread class
public class mutithreading extends Thread {
	public void start()
	{
		System.out.println("Code has been executed Successfully");
	}

	public static void main(String[] args) {
		mutithreading m=new mutithreading();
		m.start();
		
	}

}
