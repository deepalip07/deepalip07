package JavaPracticeProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Test_16_july 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		/*System.out.println("Enter side a-->");
		int a= s.nextInt();
		System.out.println("Enter side b-->");
        int b=s.nextInt();*/
		
		int a;
		int b;
		int area_of_rectangle;
		int arr1[]=new int[4];
		
	    //int arr[]= new int[4];		
		System.out.println("Enter the side a--->");
			a= s.nextInt();
			arr1[0]=a;
			System.out.println("Enter the side b--->");
			 b= s.nextInt();
			 arr1[1]=b;
	        area_of_rectangle=a*b;
		     System.out.println("Area-->" +area_of_rectangle);
		     System.out.println(Arrays.toString(arr1));
	}

}
