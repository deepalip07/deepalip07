package Collection_Programs;

import java.util.HashMap;
import java.util.Map;

public class Map_01 
{

	public static void main(String[] args) 
	{
		Map<String,Integer> m=new HashMap <>();
		
		m.put("Deepali", 201);
		m.put("Divyam", 202);
		m.put("Divyam", 202);
		m.put("Manish", 203);
		m.put("Deepali", 204);
		m.put(null, 205); // Allows null key
		m.put("Kavita", null);// Allows null values
		
		System.out.println("Original map--->"+m);
		
       Map<String,Integer> m1=new HashMap <>();
		
		m1.put("Deepali", 801);
		m1.put("Divyam", 702);
		m1.put("Kiran", 901);
		
		m.putAll(m1);
		
		System.out.println("After putAll method-->"+m);
		
		System.out.println("Are m and m1 are equal?--->"+m.equals(m1));
		
		System.out.println("Use of get() method-->"+m.get("Deepali"));
		
		System.out.println("Is map 'm' is empty?--->"+m.isEmpty());
		
		System.out.println("Get only keys  from map 'm'--->"+m.keySet());
		
		System.out.println("Print all values from map 'm1'--->"+m1.values());
		
		System.out.println("Size of map 'm'--->"+m.size());
		
		System.out.println("Use of entrySet() method-->"+m.entrySet());
		
	    System.out.println("Use of remove() for key-->"+m.remove(null));
				
		
		
		
		
		
	}

}
