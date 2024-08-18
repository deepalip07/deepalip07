package String_Functions_Practice_Prog;

import java.util.Arrays;

public class Count_special_chars
{

	public static void main(String[] args) 
	{
		String s="Deepali@%^()#$";
		String s1="";
		int alpha_count=0;
		int space_count=0;
		int count=0;
		int special_chars=0;
		
		char c[]=s.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0;i<s.length();i++)
		{
			boolean b=Character.isAlphabetic(c[i]);
			
			if(b==true)
			{
				alpha_count++;
			}
			
			boolean d=Character.isWhitespace(c[i]);
			if(d==true)
			{
				space_count++;
			}
			
			if(s.charAt(i)!=' ')
			{
				count++;
			}
			
			special_chars=count-alpha_count-space_count;
		}
		System.out.println("Alphabets--->"+alpha_count);
		System.out.println("White Space--->"+space_count);
		System.out.println("Total characters--->"+count);
		System.out.println("Special characters--->"+special_chars);
		
	}

}
