package JavaPracticeProjects;

import java.util.Arrays;

public class Copy_one_array_into_other_Assg42 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};	
		int b[]=new int[9];
		
		for(int i=0;i<=8;i++)
		{
			b[i]=a[i];
		}
        System.out.println("Integer array b is:" +Arrays.toString(b));
	}

}
