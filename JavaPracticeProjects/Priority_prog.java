package JavaPracticeProjects;
import java.util.*;
import java.util.PriorityQueue;

public class Priority_prog 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> p=new PriorityQueue<Integer> ();
		
		p.add(10);
		p.add(3);
		p.add(202);
		p.add(12);
		//p.add("deepali");
	//p.add(null);
		p.add(10);
		//p.add(22.22);
		
		//Collections.sort(p);
		
		System.out.println(p);
	}

}
