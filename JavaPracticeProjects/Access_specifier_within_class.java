package JavaPracticeProjects;

public class Access_specifier_within_class 
{

	void add()
	{
		System.out.println("Default/package access specifier..");
	}
	
	public void sub()
	{
		System.out.println("Public access specifier..");
	}
	
	private void mul()
	{
		System.out.println("Private access specifier..");
	}
	
	protected void div()
	{
		System.out.println("Protected access specifier..");
	}
	
	public static void main(String[] args) 
	{
		Access_specifier_within_class a1=new Access_specifier_within_class();
		
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();

	}

}
