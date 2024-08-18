package Assignments;
interface I1
{
	abstract void mul();
	abstract void div();
}

public class Assignment_53 implements I1
{
	public void mul() 
	{
		int a=10;
		int b=90;
		int c=a*b;
		System.out.println(c);
		
	}


	public void div()
	{

		int a=40;
		int b=2;
		int c=a/b;
		System.out.println(c);
		
	}



	public static void main(String[] args) 
	{
		Assignment_53 a=new Assignment_53();
		
		a.mul();
		a.div();

	}

}
