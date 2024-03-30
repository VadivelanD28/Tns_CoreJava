package Myproject;
//interface creation
interface iitjee{
	void competetiveexam();
}
//another interface creation
interface upscexam extends iitjee
{
//method creation for interface
	void geography();
	void polity();
	void civics();
	void economics();
}
interface myexam{
	void exams();
}

class syllabus implements upscexam{

	@Override
	public void geography() {
		System.out.println("The syllabus in the geography upsc exam");
		
	}

	@Override
	public void polity() {
		System.out.println("The syllabus in polity the upsc exam");
		syllabus d=new syllabus();
		
		
	}

	@Override
	public void civics() {
		System.out.println("The syllabus in civics the upsc exam");
		
		
	}

	@Override
	public void economics() {
		System.out.println("The syllabus economics in the upsc exam");
		
	}

	@Override
	public void competetiveexam() {
		System.out.println("The competetive exam has been started");
	}
	
}
class exam extends syllabus implements myexam{

	@Override
	public void exams() {
		System.out.println("Today Iam going to start an exam");		
	}
	
}
public class interfacesprg {

	public static void main(String[] args) {
	exam m=new exam();
	m.civics();
	m.competetiveexam();
	m.economics();
	m.exams();
	m.geography();
	
	}

}
