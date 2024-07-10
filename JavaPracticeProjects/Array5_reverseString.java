package JavaPracticeProjects;
import java.io.*;
import java.util.*; 


public class Array5_reverseString 
{
	public static void main(String[] args) 
	{
		String input="deepali";
		String output="";
		
		for(int i=input.length()-1;i>=0;i--)
	    {

			output=output+input.charAt(i);
			
		}
		
		System.out.print(output);
		
	     
	}

}
