package JavaPracticeProjects;

import java.util.Scanner;

public class Odd_Even_Exp_Handling_Ex 
{
	static int a;
	static void Check_even_odd(int a) throws IllegalArgumentException
	{
		if(a % 2 !=0)
		{
			throw new IllegalArgumentException(a+ "-->is odd number");
		}
		else
		{
			System.out.println(a+ "-->is an even number");
		}
		
	}
	public static void main(String[] args) 
	{
		try 
		{
		    Check_even_odd(13);
		    //System.out.println(a + "is odd");
		    
		}
		
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
		
		}

}
