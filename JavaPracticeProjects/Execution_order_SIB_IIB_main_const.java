package Assignments;

import JavaPracticeProjects.SIB_IIB_concept;

public class Execution_order_SIB_IIB_main_const 
{
	static
	{
		System.out.println("SIB");
	}
	
	Execution_order_SIB_IIB_main_const()
	{
		System.out.println("Constructor");
	}
	
	{
		System.out.println("IIB_01");
	}
	{
		System.out.println("IIB_02");
	}

	public static void main(String[] args) 
	{
	
		Execution_order_SIB_IIB_main_const s=new Execution_order_SIB_IIB_main_const();
		Execution_order_SIB_IIB_main_const s1=new Execution_order_SIB_IIB_main_const();
		//Execution_order_SIB_IIB_main_const s2=new Execution_order_SIB_IIB_main_const();
		
		

	}

}
