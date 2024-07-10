package JavaPracticeProjects;

import java.util.Arrays;

public class Reverse_array 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6};
		int b[]=new int[6];
		
		for(int i=a.length-1,j=0;i>=0 && j<=a.length-1;i--,j++)
		{
	      b[j]=a[i];
		}
		
		System.out.println(Arrays.toString(b));
	}

}
