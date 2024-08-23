package Collection_Programs;

import java.util.Vector;

public class Legacy_class_method_Vector {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		
		v.add("Deepali");
        v.add("Divyam");
		v.add("Ankita");

		v.add("Mahesh");

		v.add("Shreyan");
		
		System.out.println(v);
		
		System.out.println("Capacity method-->"+v.capacity());
		
		System.out.println("First element-->"+v.firstElement());
		
		System.out.println("Get by index method-->"+v.get(1));
		System.out.println("Contains method-->"+v.contains("Divyam"));
		
		System.out.println("Index of  method-->"+v.indexOf("Deepali"));
		System.out.println("Is vector is empty..?-->"+v.isEmpty());
		System.out.println("Last element method--->"+v.lastElement());
		
		

		

		


	}

}
