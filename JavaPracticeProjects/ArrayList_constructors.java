package Collection_Programs;

import java.util.ArrayList;

public class ArrayList_constructors 
{

	public static void main(String[] args) 
	{
	
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(40);
		al.add(50);
		al.add(20);
		
		System.out.println(al);
		
		ArrayList al2=new ArrayList<>();
		
		al2.add(200);
		al2.add(300);
		al2.add(900);
		al2.add(800);
		
		System.out.println(al2);
		
		ArrayList al3=new ArrayList(6);
		
		al3.add(20);
		al3.add(90);
		al3.add(22);
		al3.add(78);
		al3.add(99);
		al3.add(80);
		al3.add(23);
		al3.add(900);
		System.out.println(al3);
		
		

	}

}
