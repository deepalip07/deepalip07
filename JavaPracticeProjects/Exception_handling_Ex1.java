package JavaPracticeProjects;

public class Exception_handling_Ex1 
{
	public static void main(String[] args) 
	{
		try 
		{
		   int a[]= {1,2,3};
		   System.out.println(a[9]);
		}
		
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a);
		}
		
	
		

	}

}
