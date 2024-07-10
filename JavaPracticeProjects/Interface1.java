package JavaPracticeProjects;

interface I1
{
	void add();
	void sub();
}

class C implements I1
{


	public void add() 
	{
		System.out.println("Add method...");
		
	}


	public void sub() 
	{
		System.out.println("Substraction method....");
		
	}
	
	
}

public class Interface1 {

	public static void main(String[] args) 
	{
		C c1=new C();
		
		c1.add();
		c1.sub();
	}

}
