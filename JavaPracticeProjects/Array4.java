package JavaPracticeProjects;

import java.util.Arrays;

public class Array4 

{
	public final boolean isEquals(int a[],int b[])
	{
		boolean flag=true;
	
	if(a.length!=b.length)
		{
			System.out.println("Arrays not equal..");
			
		}
		else
		{
			for(int i=0;i<5;i++)
			{
			if(a[i]==b[i])
			continue;
			else
			
				return false;
			}
			

			
	}return flag;
	}

	//return flag;


	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5,8,9};	
		
		System.out.println("Arrays are equal or not" +Arrays.equals(a, b));
		
		Array4 t=new Array4();
		System.out.println(t.isEquals(a, b));
		
	}
}
	


