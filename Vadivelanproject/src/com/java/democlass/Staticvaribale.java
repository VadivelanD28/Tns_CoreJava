package com.java.democlass;
class Counter{
	static int A=1000;  // Here assigning static variable keyword

Counter(){ // This is an constructor
	A++;
}
void disp() {
	System.out.println(A);
}
public class Staticvaribale {

	public static void main(String[] args) {
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();
            c1.disp();
            c2.disp();
            c3.disp();
	}

}}
