package JavaPracticeProjects;

public class Assignment10 
{
	
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition:" +c);
	}

	void sub()
	{
		int a=50;
		int b=20;
		int c=a-b;
		System.out.println("Substraction:" +c);
	}
	
	public static void main(String[] args) 
	{
		Assignment10 a=new Assignment10();
		
		a.add();
		a.sub();

	}

}
