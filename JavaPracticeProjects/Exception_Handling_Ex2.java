package JavaPracticeProjects;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handling_Ex2 
{
	

	public static void main(String[] args) 
	{
		 Scanner s=new Scanner(System.in);
		try 
		{
			String[] name=new String[3];
			name[0]="Ram";
			name[1]="Shayam";
		    System.out.println("Enter value of name[2]");
		    name[2] =s.next();
	
		}
		catch(InputMismatchException r)
		{
			System.out.println(r);
		}
		
		

	}

}
