package JavaPracticeProjects;

import java.util.Arrays;

public class Remove_specific_element_from_array 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		//int b[]=new int [6];
			int i;
		System.out.println(Arrays.toString(a));
		
		int removeIndex=2;
		
		for(i=removeIndex;i<a.length-1;i++)
		{
			a[i]=a[i+1];
			
		}
		System.out.println(Arrays.toString(a));
	   
		
	}

}

