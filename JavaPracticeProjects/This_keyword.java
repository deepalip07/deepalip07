package Assignments;

public class This_keyword 
{
	int a;
	int b;
	int c;
	
	
	This_keyword(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	
	void add()
	{
		c=a+b;
		System.out.println("Addition id-->"+c);
	}
 

	public static void main(String[] args) 
	{
		This_keyword t=new This_keyword(10,20);
		
		t.add();
		
	}
	
	
	

}
