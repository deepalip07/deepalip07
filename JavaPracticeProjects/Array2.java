package JavaPracticeProjects;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) 
	{
	  int a[]= {1,2,3,4,5};
	  int a1[]= {5,6,0,3,9};
	  boolean b[]= new boolean[4];
	  
	  char c1[]= {'a','b','c','d','e'};
	  
	  int c[]= {4,2,9,1,0};
	  
	  System.out.println(Arrays.toString(a)); // To print integer array
	  
	  System.out.println(Arrays.toString(b)); // To print boolean array
	  
	  System.out.println(Arrays.toString(c1)); // To print char array
	  
	  // Sorting of integer array
	  
	  System.out.println("Original array is:" +Arrays.toString(c));
	 
	   Arrays.sort(c);
	  
	  System.out.println("Array after sorting is:" +Arrays.toString(c));
	  
	  // Check whether 2 integer arrays are equal or not
	   
	 System.out.println("Is 2 integer arrays are Equal? -- >" +Arrays.equals(a, a1)); 
	  
	  
	}

}
