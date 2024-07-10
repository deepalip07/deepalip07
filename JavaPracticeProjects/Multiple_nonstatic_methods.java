package JavaPracticeProjects;

public class Multiple_nonstatic_methods 
{

	void add()
	{
		System.out.println("Non static method-add");
	}
	
	void sub()
	{
		System.out.println("Non static method-sub");
	}
	
	void mul()
	{
		System.out.println("Non static method-mul");
	}
	
	public static void main(String[] args) 
	{
		Multiple_nonstatic_methods m=new Multiple_nonstatic_methods();
		
		m.add();
		m.sub();
		m.mul();

	}

}
