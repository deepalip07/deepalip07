package Collection_Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Iterate_Map_value {

	public static void main(String[] args) 
	{
		Map m=new HashMap();
		
		m.put("Deepali", "Tester");
		m.put("MAnish", "Developer");
		
		m.put("Ankita", "Manager");
		m.put("Mahesh", "Junior Develper");
		
		System.out.println(m);
		
	Iterator <Map.Entry<String, String>> i= m.entrySet().iterator();
	
	while(i.hasNext())
	{
		Map.Entry<String, String> e=i.next();
		System.out.println("Key-->"+e.getKey() +     "Value--->"+e.getValue());
	}
		

	}

}
