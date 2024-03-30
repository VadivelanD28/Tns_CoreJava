package Myproject;
import java.io.*;

public class throwerror {
    public static void vote(int age) throws Exception {
        if (age > 18) 
        {
            System.out.println("You are eligible to vote");
        } 
        else 
        {
            // Throw keyword syntax has been used below
            
                throw new Exception("You are not eligible for voting");
            } 
            
        }
    

    public static void main(String[] args) {
        try {
			vote(15);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
    }
}
