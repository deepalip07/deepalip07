package Polymorphism;

public class CompileTimePolymorphism_prog 
{
	public void login_email(String email_id)
	{
		System.out.println("Login with email..");
	}

	public void login_mobile(long mobile_no)
	{
		System.out.println("Login with mobile number..");
	}
	
	public static void main(String[] args)
	{
		
		CompileTimePolymorphism_prog c=new CompileTimePolymorphism_prog();
		c.login_email("deepali@gmail.com");
		c.login_mobile(3636363);
		
		
	}

}
