package Assignments;

import java.util.Date;

public class Find_future_time {

	public static void main(String[] args) 
	{
		 Date d=new Date();
	     System.out.println(d.getTime());
	     
	     Date d1=new Date();
	     System.out.println("Current Time--->"+d1);
	     
	     Date d2=new Date(d1.getTime()+(1000*60*60*24*1));
	     System.out.println("Current Time--->"+d2);
	     

	}

}
