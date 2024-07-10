package JavaPracticeProjects;

//Parameterised constructor

public class Constructor_Ex3 
{
     int id;
     String name;
     
     Constructor_Ex3(int i,String n)
     {
    	 id=i;
    	 name=n;
     }
     
     void display()
     {
    	 System.out.println(id+ " " +name);
     }
	public static void main(String[] args) 
	{
		 Constructor_Ex3 c1=new  Constructor_Ex3 (101,"Deepali");
	     Constructor_Ex3 c2=new  Constructor_Ex3 (102,"Radhika");
	     
	     c1.display();
	     c2.display();

	}

}
