package Assignments;

interface I2
{
	abstract void add();

	abstract void sub();
}

public class Interface_prog  implements I2
{
	@Override
	public void add() 
	{
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);
		
	}

	@Override
	public void sub() 
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) 
	{
		Interface_prog i=new Interface_prog();
		
		i.add();
		i.sub();

	}
}
