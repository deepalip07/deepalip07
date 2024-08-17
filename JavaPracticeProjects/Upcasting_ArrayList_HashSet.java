package Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Upcasting_ArrayList_HashSet {

	public static void main(String[] args)
	{
		 
		//Upcasting of ArrayList to List
		
		List al=new ArrayList();
			
			al.add(200);
			al.add(300);
			al.add(400);
			al.add(500);
			al.add(600);
			System.out.println("ArrayList--->"+al);
			
			//Upcasting of HashSet to Set
			
			Set s=new HashSet();
			
			s.add("Deepali");
			s.add("Hello");
			s.add("Hi");
			s.add("Divyam");
			
			System.out.println("HashSet--->"+s);


	}

}
