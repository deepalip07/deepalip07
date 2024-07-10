package JavaPracticeProjects;

import java.util.Arrays;

public class Find_max_value_of_array 
{

	public static void main(String[] args) 
	{
		int a[]= {3,19,9,0,1};
		
		int max=a[0];
		
		for(int i=1;i<4;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Integer array is:" +Arrays.toString(a));
		
		System.out.println("Greater number from given array  is:" +max);	
		

	}

}
