package Collection_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Vector_ex {

	public static void main(String[] args) 
	{
		Vector<Integer> v=new Vector(4,2);
		
		v.add(12);
		v.add(11);
		v.add(14);
		v.add(100);
		v.add(78);
		//v.add(null);
		//v.add(12);
	
		System.out.println("Oroginal--->"+v);
		
		Collections.sort(v);
		
	
		
		System.out.println("Sorted --->"+v);
		
		}

}
