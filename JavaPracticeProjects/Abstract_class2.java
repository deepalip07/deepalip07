package JavaPracticeProjects;

//Constructor in abstract class.

abstract class Base
{
	abstract void fun();
	
	Base()
	{
		System.out.println("Base class constructor");
	}
}

class Derived extends Base
{
	Derived()
	{
		System.out.println("Derived class constructor");
	}

	void fun()
{
    System.out.println("Fun method................");		
		
	}
}

public class Abstract_class2 
{
	
public static void main(String[] args) 
	{
		Derived d=new Derived();
		
		d.fun();

	}

}
