package JavaPracticeProjects;

class M1
{
	void login()
	{
		System.out.println("Login with mobile..");
	}
}

public class Method_overriding_Ex extends M1
{

	void login() 
	{
		System.out.println("Login with email...");
		super.login();
	}
	public static void main(String[] args) 
	{
		Method_overriding_Ex m=new Method_overriding_Ex();
		m.login();

	}

}
