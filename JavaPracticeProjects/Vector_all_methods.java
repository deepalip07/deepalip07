package Collection_Programs;

import java.util.Vector;

public class Vector_all_methods 
{

	public static void main(String[] args) 
	{
    Vector v=new Vector();
		
		v.add(12);
		v.add(11);
		v.add(14);
		v.add(100);
		v.add(78);
		v.add("Deepali");
		v.add("Red");
		
		System.out.println("Original vector list-->"+v);
		
		v.addElement(34);
		System.out.println("After adding element=34"+v);
		
		System.out.println("Defacult Capacity of vector v-->"+v.capacity());
		
		System.out.println("Is vector list contains element=11..???"+v.contains(11));
		
		System.out.println("Index of 78 is-->"+v.indexOf(78));
		
		System.out.println("Is vector list is empty--->"+v.isEmpty());
		
		System.out.println("Last element of vector 'v'-->"+v.lastElement());
		
		System.out.println("Last indexOf() method-->"+v.lastIndexOf(100));
		
		System.out.println("Remove element by giving index-->"+v.remove(0));
		
		v.removeElementAt(1);
		System.out.println("After remove element at index 1-->"+v);
		
	     v.setElementAt("Orange", 2);
	
	System.out.println("Use of setElementAt() method-->"+v);
	
	System.out.println("size-->"+v.size());

}

}
