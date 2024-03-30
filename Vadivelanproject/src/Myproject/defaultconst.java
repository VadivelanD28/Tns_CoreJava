package Myproject;
import java.io.*;
import java.util.Scanner;
class Student
{
	public String name;
	public int ID;
  Student()
  {
	  System.out.println("The Student Database");
	  name="Rajeshkanna";
	  ID=5003;
  }
  void Studentinfo()
  {
	  System.out.println("Student Name: " +name);
	  System.out.println("Student ID: " +ID);
  }
}
public class defaultconst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student a=new Student();
a.Studentinfo();
	}

}
