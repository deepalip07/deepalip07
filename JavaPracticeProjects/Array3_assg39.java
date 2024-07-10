package JavaPracticeProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Array3_assg39 
{

	public static void main(String[] args) 
	{
		// Indexing for Integer datatype  array
		int a[]=new int[3];
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Indexing of integer datatype array");
		
		for(int i=0;i<3;i++)
		{
			
			System.out.println("Enter the values of index = " +i);
			a[i]=s.nextInt();
		}
		
		System.out.println(Arrays.toString(a));
		
		System.out.println("----------------------------------------------------------------");
		
		//Indexing for double datatype array
		
		System.out.println("Indexing of Double datatype array");
		
		double d[]=new double[3];
		 
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter value of index = " +i);
			d[i]=s.nextDouble();
			
		}
		System.out.println(Arrays.toString(d));
		
		System.out.println("----------------------------------------------------------------");
		
		//Indexing for boolean datatype array
		System.out.println("Indexing of boolean datatype array");
		
		boolean b[]=new boolean[3];
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter value of index = " +i);
			b[i]=s.nextBoolean();		
		}
		System.out.println(Arrays.toString(b));
		

	}

}
