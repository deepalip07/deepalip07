package JavaPracticeProjects;

//Constructor overloading

public class Constructor_Ex4 
{
	int id;
	String name;
	int age;
	
	 Constructor_Ex4(int i,String n)
	 {
		 id=i;
		 name=n;
	 }
	 
	 Constructor_Ex4(int i,String n,int a)
	 {
		 id=i;
		 name=n;
		 age=a;
	 }

	 void display()
	 {
		 System.out.println(id+" "+name+" "+age);
	 }
	public static void main(String[] args)
	{
		 Constructor_Ex4 c1=new  Constructor_Ex4(201,"Aryan");
		 Constructor_Ex4 c2=new  Constructor_Ex4(202,"Tejal",32);
		 c1.display();
		 c2.display();
		 

	}

}
