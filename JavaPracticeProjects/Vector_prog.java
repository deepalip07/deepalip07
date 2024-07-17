package JavaPracticeProjects;

import java.util.Collections;
import java.util.Vector;

public class Vector_prog 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		
		v.add(102);
		v.add(10);
		v.add(90);
		//v.add(null);
		//v.add("deepali");
		//v.add('c');
		v.add(22);
		
		Collections.sort(v);
		
		System.out.println(v);
	}

}
