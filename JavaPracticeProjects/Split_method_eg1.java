package JavaPracticeProjects;

import java.util.Arrays;

public class Split_method_eg1 
{

	public static void main(String[] args) 
	{
		String s="My java online course";
		String a="Welcome to java world";
		String c="my name is ram";
		
		//String d[]=c.split(" ");
		String d[]=c.split(" ");
		
		
		String b[]=a.split(" ",2);
		
		String s1[]=s.split(" ");
		
		for(String s2:s1)
		{
			System.out.println(s2);
			//System.out.println("========================================");
		}
		
		System.out.println("========================================");
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(d));
		
		
	}

}
