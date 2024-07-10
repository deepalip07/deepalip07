package JavaPracticeProjects;
import java.lang.String;

import java.util.Arrays;

public class Assg45 
{

	public static void main(String[] args) 
	{
		String s="Test123 and Test456#@$%^&*";
		int num_count=0;
		int space_count=0;
		int special_chars=0;
		int alpha_count=0;
		
		char c[]=s.toCharArray();
		System.out.println(Arrays.toString(c));
				
		for(int i=0;i<s.length();i++)
		{
			boolean b=Character.isDigit(c[i]);
			if(b==true) 
			{
				num_count++;
			}
			boolean b1=Character.isWhitespace(c[i]);
					if(b1==true)
					{space_count++;}
					
				boolean b2=Character.isAlphabetic(c[i]);
				if(b2==true)
				{
					alpha_count++;
				}
				
				special_chars=s.length()-alpha_count-space_count-num_count;
				}
		System.out.println("Count of numeric values in given string-->"+num_count);
		System.out.println("Count of spaces in given string-->"+space_count);
		System.out.println("Count of alphabets in given string-->"+alpha_count);
		System.out.println("Count of special characters in given string-->"+special_chars);

	}

}
