package Myproject;

public class multisleep extends Thread {
	public void run()
	{
		for(int i=10;i<=25;i++)
		{
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				System.out.println("error handling ");
				
			}
			System.out.println(i);
		}
		
	}
	

	public static void main(String[] args) {
		multisleep m=new multisleep();
		m.run();

	}

}
