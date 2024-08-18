package String_Functions_Practice_Prog;

public class StringBuilder_constructors {

	public static void main(String[] args) 
	{
		String s1="Divyam";
		StringBuilder sb=new StringBuilder(s1);
		System.out.println(sb.append("Gawali"));
		
		StringBuilder sb1=new StringBuilder(20);
		
		System.out.println("Capacity of sb1-->"+sb1.capacity());
		
		StringBuilder sb2=new StringBuilder();
		System.out.println("Defauly capacity of stringbuffer is -->"+sb2.capacity());
	
	}

}
