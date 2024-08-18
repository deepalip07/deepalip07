package Assignments;
class A1
{
	String s="Deepali";
	void test()
	{
		System.out.println("A(Parent)--test() method");
	}
}

class B1 extends A1
{
	int i;
	void test()
	{
		System.out.println("B(Child)---test() method");
	}
	
}

public class Down_casting 
{

	public static void main(String[] args) 
	{
		A1 a=new B1();
		
		B1 b=(B1)a;
	
		b.i=10;
		System.out.println(b.i);
		System.out.println(b.s);

	}

}
