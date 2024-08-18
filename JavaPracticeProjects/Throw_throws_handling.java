package Assignments;

public class Throw_throws_handling 
{

	public static void main(String[] args)  throws NullPointerException, InterruptedException
	{
	
		System.out.println("Hello");
		Thread.sleep(5000);
		System.out.println("Bye");
		throw new NullPointerException();
	}

}
