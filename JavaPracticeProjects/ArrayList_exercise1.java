package Collection_Programs;

import java.util.ArrayList;

public class ArrayList_exercise1 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList(8);
		
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);

		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		
		System.out.println("ArrayList before adding element--->");
		System.out.println(al);
		
		al.add(0,100);
		System.out.println("ArrayList after adding element at 0th index--->");
		System.out.println(al);

	}

}
