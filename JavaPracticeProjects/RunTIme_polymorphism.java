package Polymorphism;

public class RunTIme_polymorphism 
{
    void Test1()
    {
    	System.out.println("Overriden method");
    }
	
}

class Test01 extends RunTIme_polymorphism
{
	 void Test1()
	    {
	    	System.out.println("Overriding method");
	    }

	
	public static void main(String[] args) 
	{
		RunTIme_polymorphism r=new Test01();
		
		r.Test1();
		

	}

}
