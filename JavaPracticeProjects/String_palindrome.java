package JavaPracticeProjects;

public class String_palindrome 
{

	public static void main(String[] args) 
	{
	   String input="radar";
	   String output="";
	   
	   for(int i=input.length()-1;i>=0;i--)
	   {
		   output=output+input.charAt(i);
		
	   }
	 System.out.println(output);
     
	System.out.println(input.equals(output));
}

}
