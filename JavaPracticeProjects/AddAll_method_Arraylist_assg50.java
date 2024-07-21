package Collection_Programs;

import java.util.*;

public class AddAll_method_Arraylist_assg50 {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		
		a.add("Deepali");
		a.add(100);
		a.add(true);
		a.add(null);
		a.add("Pink");
		System.out.println("ArrayList1----->");
		System.out.println(a);
		
	ArrayList a1=new ArrayList();
		
		a1.add("Divyam");
		a1.add(200);
		a1.add("Red");
		a1.add("White");
		a1.add(100.34);
		System.out.println("ArrayList2----->");
		System.out.println(a1);
		
		a.addAll(1, a1);
		System.out.println("ArrayList after addAll method----->");
		System.out.println(a);

	}

}
