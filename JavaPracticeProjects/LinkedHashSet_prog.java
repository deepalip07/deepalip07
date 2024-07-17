package JavaPracticeProjects;
import java.util.*;  

public class LinkedHashSet_prog 
{

	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer> ();
		lh.add(10);
		lh.add(20);
		lh.add(100);
		lh.add(30);
		lh.add(10);
		lh.add(null);
		//lh.add("deepali");
		
		//Collections.sort(lh);
		
		System.out.println(lh);

	}

}
