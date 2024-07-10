package JavaPracticeProjects;

// default constructor that displays default values 
public class Constructoe_Ex2 
{
	int id;
	String name;
    
	void display()
	{
		System.out.println(id+" " +name);
	}
	

	public static void main(String[] args) 
	{
		Constructoe_Ex2 c1=new Constructoe_Ex2();
		Constructoe_Ex2 c2=new Constructoe_Ex2();
		Constructoe_Ex2 c3=new Constructoe_Ex2();
		
		c1.display();
		c2.display();
		c3.display();
		
	}

}
