package JavaPracticeProjects;

public class Overloading_Ex2 
{
	static void add(int a,int b)
	{
		System.out.println("int arguments method executed");
	}
	
	static void add(long a,long b)
	{
		System.out.println("long arguments method executed");
	}

	public static void main(String[] args)
	{
		add(20,20);

	}

}
