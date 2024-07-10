package JavaPracticeProjects;

abstract class Test
{
	void fun()
	{
	  System.out.println("This is concrete method in abstract class....");
		
	}
}

class Test1 extends Test
{
}

public class Abs_class_no_abs_methods 
{

	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		
		t.fun();

	}

}
