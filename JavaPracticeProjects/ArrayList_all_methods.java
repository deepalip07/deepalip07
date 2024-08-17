package Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_all_methods {

	public static void main(String[] args) {
List al=new ArrayList();
		
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
		System.out.println("Element at index 1--->"+al.get(1));
		
	al.set(0, "Pink");
	System.out.println("ArrayList after set method for index 0--->"+al);
	
	System.out.println("Is ArrayList contains element 500 in it??--->"+al.contains(500));
	
	System.out.println("Is arraylist al is empty??-->"+al.isEmpty());
	
	System.out.println("Index of element Pink is-->"+al.indexOf("Pink"));

	ArrayList al1=new ArrayList();
	 al1.add("Deepali");
	 al1.add("Manish");
	 al1.add("Priyanka");
	 al1.add("Ankita");
	 
	 System.out.println(al1);
	 
	Collections.replaceAll(al1, "Deepali", "Eknath");
	System.out.println("ArrayList after replacing Deepati to Eknath-->"+al1);
	
	al1.removeAll(al1);
	System.out.println("ArrayList after removing all elements-->"+al1);
	
	al.clear();
	System.out.println("ArrayList al after clear method--->"+al);
	

	}

}
