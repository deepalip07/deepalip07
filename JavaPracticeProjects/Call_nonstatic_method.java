package JavaPracticeProjects;

public class Call_nonstatic_method {

	void add()
	{
		System.out.println("Non static method call in main method");
	}
	public static void main(String[] args) 
	{
		
		Call_nonstatic_method n=new Call_nonstatic_method();
		n.add();
	}

}
