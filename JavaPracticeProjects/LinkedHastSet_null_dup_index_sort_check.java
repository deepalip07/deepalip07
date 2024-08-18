package Collection_Programs;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHastSet_null_dup_index_sort_check {

	public static void main(String[] args) 
	{
		
		LinkedHashSet l=new LinkedHashSet();
		
		l.add(100);
		l.add(null);
		l.add(100);
		l.add("Deepali");
		l.add(3);
		l.add(100);
		System.out.println(l);
		
		//Collections.sort(l);  //not apllicable for LinkedHashSet
	}

}
