package Myproject;
class Demoprg
{
	
	//encapsulation example
	//        Always keep instance class variable in private 
	private int age=22;
	
	
	
    //         Always keep method in public state........
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("The age changed into : "+age);
		this.age = age;
	}
	
}
public class eencapsul
{
	public static void main (String[] args)
	{
		Demoprg obj=new Demoprg();
		obj.setAge(50);
	System.out.println(obj.getAge());
	}
}