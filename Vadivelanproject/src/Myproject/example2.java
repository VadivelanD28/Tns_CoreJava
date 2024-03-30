package Myproject;

public class example2 {
public static void vote(int age)
{
	if(age<18)
	{
		throw new ArithmeticException("This persons are not eligible to vote");

	}
	else
	{
		System.out.println("You are eligible to vote");
	}
}
	public static void main(String[] args) {
		vote(10);
		System.out.println("Rest of the code");
	}

}
