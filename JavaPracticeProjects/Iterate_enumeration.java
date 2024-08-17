package Collection_Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class Iterate_enumeration {

	public static void main(String[] args) 
	{
          List al=new ArrayList();
		
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		
		System.out.println(al);
		
		Enumeration<Integer> e=Collections.enumeration(al);
		
		while(e.hasMoreElements())
		{
			System.out.println("Iteration of ArrayList is-->"+e.nextElement());
		}
		  

	}

}
