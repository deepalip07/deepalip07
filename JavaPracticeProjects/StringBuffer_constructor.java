package StringBuffer_pkg;

public class StringBuffer_constructor {

	public static void main(String[] args) 
	{
		
		String s1="Deepali";
		StringBuffer sb=new StringBuffer(s1);
		System.out.println(sb.append("Patil"));
		
		StringBuffer sb1=new StringBuffer(20);
		
		System.out.println("Capacity of sb1-->"+sb1.capacity());
		
		StringBuffer sb2=new StringBuffer();
		System.out.println("Defauly capacity of stringbuffer is -->"+sb2.capacity());
		
	}

}
