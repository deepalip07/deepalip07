package Practice_core_java_assig;

import java.util.Scanner;

public class Switch_case_prog {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENter value of a--->");
		int a=s.nextInt();
		
		System.out.println("ENter value of b--->");
		int b=s.nextInt();
		
		System.out.println("Please enter case number-->");
		int d=s.nextInt();
		
		switch(d)
		{
		case 1:
			int c=a+b;
			System.out.println("Addition is-->"+c);
			break;
			
		case 2:
			 c=a-b;
			 System.out.println("Substraction is-->"+c);
			 break;
		    
		case 3:
			 c=a*b;
			 System.out.println("Multiplication is-->"+c);
			 break;
			 
		
		    
		}
		
		
		
		
	}

}
