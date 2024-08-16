package StringBuffer_pkg;

import java.util.Calendar;

public class Exercide_02 {

	public static void main(String[] args) 
	{
	
		String s1="How";
		String s2="   Welcome to java world";
		
		char[] arr=new char[13];
		char[] ar=new char[30];
		
		String s4="How are you?";
		
		StringBuffer sb=new StringBuffer(s2);
	
	    System.out.println(s1.contentEquals(sb));
		
		/*s1.getChars(0,3, arr, 0);
		System.out.println(arr);
		
		s2.getChars(0, 21, ar, 0);
		System.out.println(ar);*/
		
	String s3= s2.replace('W', 'o');
	 System.out.println(s3);
		
		//String s4=s2.trim();
		//System.out.println(s4);
			
				

	}

}
