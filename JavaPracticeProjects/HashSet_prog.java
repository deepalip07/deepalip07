package JavaPracticeProjects;
import java.util.Collections;
import java.util.HashSet;

public class HashSet_prog {

	public static void main(String[] args) 
	{
		HashSet<Integer> h=new HashSet<> ();
		
		h.add(900);
		h.add(1);
		h.add(700);
		h.add(10);
		h.add(700);
		h.add(null);
		//h.add("deepali");
		//Collections.sort(h);
		
		System.out.println(h);
		

	}

}
