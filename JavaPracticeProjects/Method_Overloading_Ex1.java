package JavaPracticeProjects;

public class Method_Overloading_Ex1 
{
	
	static int add(int a,int b)
	{
		return a+b;
	}
	
	static int add(int a, int b,int c)
	{
	 return a+b+c;
	}

	public static void main(String[] args) 
	{
	
		System.out.println(Method_Overloading_Ex1.add(30,30));
		System.out.println(Method_Overloading_Ex1.add(30,30,30));
	}
       

}
