package Collection_Programs;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priority_Queue_ex1 {

	public static void main(String[] args) 
	{
		
		PriorityQueue p=new PriorityQueue();
		
		p.add(10);
		p.add(30);
		p.add(2);
		p.add(67);
		p.add(3);
		//p.add(null);
		p.add(10);
		
		System.out.println(p);
		
		System.out.println(p.peek());
		System.out.println(p.poll());
	//	Collections.sort(p);
		
		

	}

}
