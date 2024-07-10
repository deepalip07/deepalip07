package JavaPracticeProjects;

abstract class assg34
{
	abstract void add();
	abstract void mytest();
	
	void mul(int a,int b)
	{
		 a=10;
		 b=20;
		 int c=a*b;
		 System.out.println(c);
		
	}
	
	void sub(int a,int b)
	{
		a=50;
		b=20;
		int c=a-b;
		System.out.println(c);
	}
}

class child_class extends assg34
{

	void add() 
	{
		System.out.println("Add method implementation in child class");
	}

	void mytest() 
	{
		System.out.println("Mytest implementation in child class");
		
	}
}

public class Abstract_class_assg34 {

	public static void main(String[] args) 
	{
		
		child_class c=new child_class();
		c.add();
		c.sub(90, 50);
		c.mul(30, 30);
        c.mytest();
	}

}
