package JavaPracticeProjects;

public class Paramerised_method {
	
	static void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void sub(int num1,int num2)
	{
		int num3=num1-num2;
		System.out.println(num3);
	}
	static void mul(boolean ans,int d)
	{
	
		System.out.println("Multiplication");
	}
	void div(boolean ans,char q)
	{
		System.out.println("Division");
	}
	
 public static void main(String[] args) 
	{
	Paramerised_method p=new Paramerised_method();
	add(10, 90);
	p.sub(100,50);
	mul(true, 20);
	p.div(false,'q');
	}

}
