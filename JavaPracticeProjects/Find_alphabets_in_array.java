package JavaPracticeProjects;

import java.util.Arrays;

public class Find_alphabets_in_array 
{

	public static void main(String[] args) 
	{   
		int count=0;
		String input="Name123";
		int i=0;
		char c[]=input.toCharArray();
		
	    System.out.println(Arrays.toString(c));
	    
	    for(i=0;i<input.length();i++)
	    {
	    	
	    	 boolean b=Character.isAlphabetic(c[i]);
	    	 if(b==true)
	    	 {
	    		 count++;
	    	 }
	    	
	    	  /* if(input.charAt(i)!=' ')// To print count of total characters in given string
	    	   {
	    		 count=count+1;
	    		 
	    	   }*/
	    }
	    System.out.println("Count of alphabets in given string:"+count);
	    	 
	    	 
	    	 /*if(Character.isAlphabetic(c[i]))
	    	 {
	    		
	    		 System.out.println(c[i]);
	    		
	    		
	    	 }*/
	  
	    }
	}



