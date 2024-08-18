package Assignments;

class A
{
	void test()
	{
		System.out.println("A(Parent)--test() method");
	}
}

class B extends A
{
	void test()
	{
		System.out.println("B(Child)---test() method");
	}
	
}



public class Upcasting_sub_to_super_class 
{

	public static void main(String[] args) 
	{
		A a=new B();
		a.test();
	}

}
