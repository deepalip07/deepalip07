package JavaPracticeProjects;

public class String_functions_assg37 {

	public static void main(String[] args) 
	{
		String a="My name is Deepali Patil";
		String b="manish kumar tiwari";
		String c="tom";
		
		System.out.println(a.isEmpty());
		System.out.println(a.lastIndexOf('y'));
		System.out.println(a.replace('M','H'));
		System.out.println(a.replaceAll(" "," "));
		System.out.println(a.replaceAll("name", "test"));
		System.out.println(b.endsWith("tiwari"));
		System.out.println(b.endsWith("MKT"));
		System.out.println(b.startsWith("manish"));
		System.out.println(b.startsWith("grotechminds"));
		System.out.println(b.matches("(.*)k(.*)"));
		System.out.println(c.matches("..."));
	}
	
	

}