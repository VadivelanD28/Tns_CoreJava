package Myproject;
import java.io.*;
import java.util.Scanner;
class calculator
{
	private int numbers=500;

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
		System.out.println("The number has been changed into:"+numbers);
	}
	
}
public class newexamp {

	public static void main(String[] args) {
		calculator obj=new calculator();
	     obj.setNumbers(2000);
		System.out.println(obj.getNumbers());

	}

}
