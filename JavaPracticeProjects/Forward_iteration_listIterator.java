package Collection_Programs;

import java.util.LinkedList;
import java.util.ListIterator;

public class Forward_iteration_listIterator {

	public static void main(String[] args) 
	{
		LinkedList<Integer> l1=new LinkedList <>();
	
	l1.add(100);
	l1.add(12);
	l1.add(99);
	l1.add(89);
	 	
System.out.println(l1);

ListIterator li=l1.listIterator();

while(li.hasNext())
{
	   System.out.println("Forward direction iteration using listiterator-->"+li.next());
}

for(Integer a : l1)
{
	 System.out.println(a);
}
	   
		

	}

}
