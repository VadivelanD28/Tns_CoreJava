package com.java.democlass;
/*Definition: Encapsulation is defined as binding of data members and methods 
  into an single entity it known as encapsulation.
 */    // Getter and setter methods
class Biodata{
	// normally a class contains variables, methods, constructors, inner class..
	private int age=22;
// using getter and setter methods
	public int getAge() {
		return age;
	}

	public void setAge(int val) {
		this.age = val;
		System.out.println("An age changed into "+val);
	}
   	
}
public class Encapsulation {

	public static void main(String[] args) {
		Biodata b1 =new Biodata();
		b1.setAge(50);
		System.out.println(b1.getAge());
	}

}
