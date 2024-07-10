package JavaPracticeProjects;

public class String_functions_assg35 
{

	public static void main(String[] args) 
	{
		String a="    My name is Deepali    ";
		
		System.out.println(a.length());
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
	
		//System.out.println(a.indexOf(i));
		
		System.out.println(a.charAt(3));
		System.out.println(a.trim());
		System.out.println(a.equals("id is"));
		System.out.println(a.equalsIgnoreCase("test"));
		
		System.out.println(a.contains("name"));
		System.out.println(a.substring(8)); // space is also counted here
		System.out.println(a.substring(4, 7));
		
		
	}

}
