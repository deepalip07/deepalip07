package Assignments;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List_all_methods 
{

	public static void main(String[] args) 
	{
LinkedList l=new LinkedList();
		
		l.add(10);
		l.add(100);
		l.add(21);
		l.add(32);
		
		System.out.println("LinkedList add() method-->"+l);
		
		l.addFirst(29);
		System.out.println("LinkedList addFirst() method-->"+l);
		
		l.addLast(55);
		System.out.println("LinkedList addLast() method-->"+l);
		
		l.remove(0);
		System.out.println("LinkedList remove() method-->"+l);
		
		System.out.println("LinkedList get() method-->"+l.get(1));
		
		l.set(0,200);
		System.out.println("LinkedList set() method-->"+l.get(1));
		
		LinkedList l1=new LinkedList();
		
		l1.add("Hello");
		l1.add("Yes");
		l1.add("No");
		l1.add("Hi");
		
		System.out.println(l1);
		
		
	System.out.println("Is LinkedList contains element as Hello..??--->"+l1.contains("Hello"));
	
	System.out.println("Use of getFirst method--->"+l1.getFirst());
	System.out.println("Use of getLast method--->"+l1.getLast());
	
	Iterator i=l1.iterator();
    
    while(i.hasNext())
    {
 	   System.out.println("Oroginal Order--->"+i.next());
    }
	
    Iterator i1=l1.descendingIterator();
    while(i1.hasNext())
    {
 	   System.out.println("Reverse order of iteration:"+i1.next());
    }
	l1.clear();
    
  System.out.println("List after using clear method--->"+l1);
	
	}
	}


