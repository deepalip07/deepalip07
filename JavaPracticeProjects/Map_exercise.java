package Collection_Programs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Map_exercise {

	public static void main(String[] args) 
	{
		
		Map<String,Integer> m1=new LinkedHashMap <String,Integer>();
		
		m1.put("Deepali",101);
		m1.put("Manish", 102);
		m1.put("Divyam", 103);
		m1.put("Mahesh", 104);
		
		System.out.println(m1);
		
		/*Iterator i1=m1.entrySet().iterator();
		
        while(i1.hasNext())
        {
        	System.out.println(i1.next());
        }
		*/
		
		for(Map.Entry x:m1.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
		
		System.out.println("Count of key and value pairs is "+m1.size());
		
        
		
		
		
	}

}
