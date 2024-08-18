package Collection_Programs;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSet_index_null_dup_check {

	public static void main(String[] args) 
	{
		TreeSet t=new TreeSet();
		
		//t.add("Deepali");
		//t.add(300);
		//t.add(null);
	      t.add(200);
		  t.add(300);
		  t.add(100);
		  t.add(10);
		  t.add(2);
		
		System.out.println(t);
		//Collections.sort(t);   //not applicable for treeset, as it sorts elements automatically when we print the TreeSet 
		
	}

}
