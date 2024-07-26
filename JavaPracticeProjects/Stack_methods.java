package Collection_Programs;

import java.util.Stack;

public class Stack_methods 
{

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		
		s.push("Deepali");
		s.push(101);
		s.push(true);
		s.push(null);
		s.push(101);
		
		System.out.println("Push Method--->");
		System.out.println(s);
		System.out.println("Pop Method--->");
		s.pop();
		System.out.println(s);
		
		System.out.println("Peek Method--->");
		s.peek();
		System.out.println(s);

	}

}
