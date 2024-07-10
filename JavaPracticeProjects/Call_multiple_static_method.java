package JavaPracticeProjects;

public class Call_multiple_static_method 
{
	
	static void add()
	{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println("Addition is:" +c);
	}
	
	static void sub()
	{
		int a=60;
		int b=30;
		int c=a-b;
		System.out.println("Substraction is:" +c);
	}

	public static void main(String[] args) 
	{
		add();
        sub();
	}

}
