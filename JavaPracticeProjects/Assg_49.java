package Collection_Programs;
import java.util.*;

public class Assg_49 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add(101);
		al.add(null);
		al.add(true);
		al.add("Deepali");
		al.add(23.33);
		al.add(101);
		
		ArrayList al1=new ArrayList();
		
		al1.add(201);
		al1.add(801);
		al1.add(100);
		al1.add(900);
		
		System.out.println("--------ArrayList----------");
		System.out.println();
		System.out.println(al);
		System.out.println();
		System.out.println("----------Original Arraylist---------");
		System.out.println();
		System.out.println(al1);
		System.out.println();
		Collections.sort(al1);
		System.out.println("----------Sorted arraylist------------");
		System.out.println();
		System.out.println(al1);
		System.out.println();
		
		/*----------------------------------------------------------------------------------------------------*/
		
		LinkedList l1=new LinkedList();
		l1.add(101);
		l1.add(null);
		l1.add(true);
		l1.add("Deepali");
		l1.add(23.33);
		l1.add(101);
		//Collections.sort(l1);
		
		
		System.out.println("--------LinkedList----------");
		System.out.println();
		System.out.println(l1);
		System.out.println();
		
		LinkedList l2=new LinkedList();
		l2.add(101);
		l2.add(45);
		l2.add(90);
		l2.add(5);
		l2.add(23);
		
		System.out.println("----------Original LinkedList----------");
		System.out.println();
		System.out.println(l2);
		System.out.println();
		
		System.out.println("----------Sorted LinkedLIst------------");
		
		Collections.sort(l2);
		System.out.println();
		System.out.println(l2);
		
		/*----------------------------------------------------------------------------------------------------*/
		
		Vector v=new Vector();
		v.add(101);
		v.add(null);
		v.add(true);
		v.add("Deepali");
		v.add(23.33);
		v.add(101);
		System.out.println("--------Vector----------");
		System.out.println();
		System.out.println(v);
		System.out.println();
		
		Vector v1=new Vector();
		v1.add(400);
		v1.add(122);
		v1.add(1000);
		v1.add(34);
		v1.add(23);
		System.out.println("----------Original Vector List----------");
		System.out.println();
		System.out.println(v1);
		System.out.println();
		System.out.println("----------Sorted Vector List--------");
	
		Collections.sort(v1);
		System.out.println();
		System.out.println(v1);
		System.out.println();
		
		/*----------------------------------------------------------------------------------------------------*/
		
		PriorityQueue p=new PriorityQueue();
		/*p.add(101);
		p.add(null);
		p.add(true);
		p.add("Deepali");
		p.add(23.33);
		p.add(101);*/
		
		p.add(101);
		p.add(102);
		p.add(103);
		p.add(90);
	
        System.out.println("--------Priority Queue----------");
		System.out.println();
		System.out.println(p);
		System.out.println();
		
		/*----------------------------------------------------------------------------------------------------*/
		
		HashSet h=new HashSet();
		
		h.add(101);
		h.add(null);
		h.add(101);
		h.add(10);
		h.add(233);
		h.add("Deepali");
		h.add(50.55);
		 System.out.println("--------Hash Set----------");
		 System.out.println();
		System.out.println(h);
		

		/*----------------------------------------------------------------------------------------------------*/
		
		TreeSet t=new TreeSet();
		
		t.add(100);
		t.add(10);
		t.add(900);
        t.add(788);
		//t.add(null);
		//t.add(true);
		
		System.out.println("-----------Tree Set------------");
		System.out.println();
		System.out.println(t);
		/*----------------------------------------------------------------------------------------------------*/
		
		
		LinkedHashSet lh=new LinkedHashSet();
		
		lh.add("Red");

		lh.add("White");

		lh.add("Pink");

		lh.add(100);
		lh.add(true);
		lh.add(null);
		lh.add(100);
		
		System.out.println("----------------Linked Hash Set----------------");
		System.out.println(lh);
		
		
		
		
		
		
		
	}
	

}
