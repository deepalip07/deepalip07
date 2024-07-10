package JavaPracticeProjects;

public class Method_Overloading_Ex3 
{
	 void add(int a,long b)
	 {
		 System.out.println("A method executed");
	 }
	
	void add(long a,int b)
	{
		System.out.println("B method executed");
	}
	

	public static void main(String[] args) 
	{
		
      Method_Overloading_Ex3 m1=new Method_Overloading_Ex3();
      
      m1.add(40,40);
      
	}

}
