package JavaPracticeProjects;

import java.util.Scanner;

public class Registration_Form 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("........Registration Form..........");
		System.out.println("Enter First Name:");
		String f_name=s1.next();
		System.out.println("Enter Last Name:");
		String l_name=s1.next();
		System.out.println("Enter Email:");
		String email=s1.next();
		System.out.println("Enter Password:");
		String password=s1.next();
		System.out.println("Enter Gender of person:");
		String Gender=s1.next();
		System.out.println("Enter Present Address:");
		String present_address=s1.next();
		System.out.println("Enter Permenent Address:");
        String permenent_address=s1.next();
        System.out.println("Enter Pincode:");
        double pincode=s1.nextDouble();
		

	}

}
