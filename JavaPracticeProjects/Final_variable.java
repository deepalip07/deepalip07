package JavaPracticeProjects;

public class Final_variable 
{
     static final double pi= 3.14;
     static int r=10;
     
     static void area_of_circle()
     {
    	 double area=pi*r*r;
    	 System.out.println("Area.... "+area);
    	 
     }
     
     static void circumference_of_circle()
     {
    	 
    	 double circumference=2*pi*r;
    	 System.out.println("circumference...."+circumference);
     }
     
	public static void main(String[] args) 
	{
		area_of_circle();
		circumference_of_circle();
		
	}

}
