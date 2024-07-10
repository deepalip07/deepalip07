package JavaPracticeProjects;

abstract class C1
{
	abstract void printInfo();
}

class Employee extends C1
{
    void printInfo() 
	{
    	String name="Deepali";
    	int age=29;
    	float salary=333.2f;
    	
    	System.out.println(name);
    	System.out.println(age);
    	System.out.println(salary);
		
	}
	
}

public class Abstract_class1 
{

	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.printInfo();
	}

}
