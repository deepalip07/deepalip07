package JavaPracticeProjects;

import java.util.Arrays;

public class Find_common_element_in_2arrays 
{
	 
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,7,8};
		int b[]= {2,3,0,11,12,7,8};
		
		System.out.println("Array1-->"+Arrays.toString(a));
		System.out.println("Array2-->"+Arrays.toString(b));
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println("Common element in given array-->"+a[i]);
					
				}
			}
		}
	 
	 }
	 
	  

	}


