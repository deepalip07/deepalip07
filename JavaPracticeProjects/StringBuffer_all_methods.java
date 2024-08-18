package StringBuffer_pkg;

public class StringBuffer_all_methods {

	public static void main(String[] args)
	{
		String s1="How";
		String s2="   Welcome to Grotechminds....!";
		
		char[] arr=new char[13];
		char[] ar=new char[30];
		
		String s5="How are you?";
		
		StringBuffer sb=new StringBuffer(s2);
	
	    System.out.println("Content equals method-->"+s1.contentEquals(sb));
		
		s1.getChars(0,3, arr, 0);
		System.out.println(arr);
		
		s2.getChars(0, 21, ar, 0);
		System.out.println("getChars method-->"+ar);
		
	    String s3= s2.replace('W', 'o');
	    System.out.println("Replace method-->"+s3);
		
		 s5=s2.trim();
		System.out.println("Trim method-->"+s5);
		
		System.out.println("Reverse method-->"+sb.reverse());
		
		System.out.println("Capacity method-->"+sb.capacity());
		
		System.out.println("Char at method-->"+sb.charAt(5));
		
		System.out.println("Insert offset-->"+sb.insert(0, false));
		
		System.out.println("Delete char at method-->"+sb.deleteCharAt(8));
			
	
	}

}
