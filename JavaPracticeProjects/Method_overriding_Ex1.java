package JavaPracticeProjects;

class M1
{
	final void login()
	{
		System.out.println("Login with Mobile number..");
	}
}

public class Method_overriding_Ex1 extends M1
{

	void login()
	{
		System.out.println("Login with email id..");
	}
	public static void main(String[] args) 
	{
		Method_overriding_Ex1 m1=new Method_overriding_Ex1();
		
		m1.login();

	}

}
