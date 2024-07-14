package JavaPracticeProjects;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Nested_Try_Catch_Ex 
{
	 static Scanner s1=new Scanner(System.in);
	 static Scanner s2=new Scanner(System.in);
	public static void main(String[] args) 
	{
		try 
		{
		    System.out.println("Enter the mobile number");
		    double m=s1.nextDouble();
		}
				
		  
		catch(InputMismatchException a)
		{
			System.out.println(a);
		try
			{
				System.out.println("Please enter valid mobile number:");
				double n=s2.nextDouble();
			}
				catch(InputMismatchException b)
				{
					System.out.println(b);
				}
			}
		}
}

	



