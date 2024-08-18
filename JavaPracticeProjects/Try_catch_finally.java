package Assignments;

public class Try_catch_finally {

	public static void main(String[] args) 
	{
		try 
		{
		   int a[]= {1,2,3};
		   System.out.println(a[9]);
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		finally
		{
			System.out.println("Finally block executed...!!");
		}
		System.out.println("Outside try,catch,finally...!!!");
	}

}
