package Collection_Programs;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSet_01 {

	public static void main(String[] args) 
	{
		HashSet s=new HashSet();
		
		s.add(12);
		s.add("Hello");
		s.add(null);
		s.add(12);
		s.add(null);
		System.out.println(s);
		
	    //Collections.sort(s); // not applicable for HashSet
		
		System.out.println(s.contains("Hello"));

	}

}
