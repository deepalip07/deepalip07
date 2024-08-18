package Assignments;

interface I1
{
	abstract void mul();
	abstract void div();
}

public class Multiple_inheritance  implements I1
{
	@Override
	public void mul() 
	{
		int a=10;
		int b=2;
		int c=a*b;
		System.out.println(c);
		
	}

	@Override
	public void div()
	{

		int a=10;
		int b=2;
		int c=a/b;
		System.out.println(c);
		
	}


	public static void main(String[] args) 
	{
		Multiple_inheritance m=new Multiple_inheritance();
		
		m.mul();
		m.div();

	}

	
}
