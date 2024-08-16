package Collection_Programs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_exercise01 
{

	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList <>();
		
		l1.add(100);
		l1.add(12);
		l1.add(99);
		l1.add(89);
		 	
	System.out.println(l1);
	
      Iterator i=l1.iterator();
       
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }
	
       Iterator i1=l1.descendingIterator();
       while(i1.hasNext())
       {
    	   System.out.println("Reverse order of iteration:"+i1.next());
       }
       
       /*ListIterator li=l1.listIterator();
       
       while(li.hasNext())
       {
    	   System.out.println(li.hasNext());
       }
       
     for(Integer a : l1)
     {
    	 System.out.println(a);
     }*/
    	   
       
	}

}
