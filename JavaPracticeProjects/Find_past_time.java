package Assignments;

import java.util.Date;

public class Find_past_time {

	public static void main(String[] args) 
	{
		 Date d=new Date();
		 
		 
		 
	     Date d1=new Date(d.getTime()-(1000*60*60*24*1));
	     System.out.println("Past Time--->"+d1);
	     
	     
	     
	}

}
