package JavaPracticeProjects;

import java.util.Scanner;

public class A_circle_scanner 
{

 public static void main(String[] args) 
	{
		
		Scanner s1=new Scanner(System.in);
		
		System.out.println("........AREA OF CIRCLE........");
		
		System.out.println("Enter radius of a circle: ");
		int r= s1.nextInt();
		
		System.out.println("Enter value of pi variable: ");
		double pi=s1.nextDouble();
		
		
		double area_of_circle=pi*r*r;
		
		System.out.println("Area of circle is:" +area_of_circle);
		
		System.out.println("======================================");
		
		System.out.println("........CIRCUMFERENCE OF CIRCLE........");
		
		System.out.println("Enter radius of a circle: ");
		 r= s1.nextInt();
	     System.out.println("Enter value of pi variable: ");
	     pi=s1.nextDouble();
	    
	     double circum_of_circle=2*pi*r;
	     System.out.println("Circumference of circle is:" +circum_of_circle);
	     
	     System.out.println("======================================");
		 System.out.println("........AREA OF SQUARE........");
		 
		 System.out.println("Enter side of square:");
		 int side=s1.nextInt();
		 
		 int area_square=side*side;
		 System.out.println("Area of square is:" +area_square);
		 System.out.println("======================================");
		 
		 System.out.println("........CIRCUMFERENCE OF SQUARE........");
		 
		 System.out.println("Enter side of square:");
		 side=s1.nextInt();
		 
		 int circum__of_square=4*side;
		 System.out.println("Circumference of square is:" +circum__of_square);
		 
		 System.out.println("======================================");
		 System.out.println("........AREA OF TRIANGLE........");
		
		 System.out.println("Enter base of triangle:");
		 int base=s1.nextInt();
		 
		 System.out.println("Enter height of triangle:");
		 int height=s1.nextInt();
		 
		 double area_of_triangle=0.5*base*height;
		 System.out.println("Area of triangle is:" +area_of_triangle);
		 System.out.println("======================================");
		 
		 System.out.println("........CIRCUMFERENCE OF TRIANGLE........");
		 System.out.println("Enter side1 of square:");
		 int side1=s1.nextInt();
		 
		 System.out.println("Enter side2 of square:");
		 int side2=s1.nextInt();
		 
		 System.out.println("Enter side3 of square:");
		 int side3=s1.nextInt();
		 int circum__of_triangle=side1*side2*side3;
		 
		 System.out.println("Circumference of triangle is:" +circum__of_triangle);
		 
		 System.out.println("======================================");
		 System.out.println("........AREA OF RECTANGLE........");
		 
		 System.out.println("Enter length of rectangle:");
		 int length=s1.nextInt();
		 
		 System.out.println("Enter width of rectangle:");
		 int width=s1.nextInt();
		 
		 int area_of_rectangle=length*width;
		 System.out.println("Area of rectangle is:" +area_of_rectangle);
		 System.out.println("======================================");
		 
		 System.out.println("........CIRCUMFERENCE OF RECTANGLE........");
		 System.out.println("Enter length of rectangle:");
		 length=s1.nextInt();
		 
		 System.out.println("Enter width of rectangle:");
		 width=s1.nextInt();
		 
		 int circum_of_rectangle=2*length+2*width;
		 
		 System.out.println("Circumference of rtectangle is:" +circum_of_rectangle);
		 System.out.println("======================================");
		 
		 System.out.println("........AREA OF TRAPEZIUM........");
		 
		 System.out.println("Enter parallel side1 of trapezium:");
		 int parallel_side1=s1.nextInt();
		 
		 System.out.println("Enter parallel side2 of trapezium:");
		 int parallel_side2=s1.nextInt();
		 
		 System.out.println("Enter  side3 of trapezium:");
		 int s3=s1.nextInt();
		 
		 System.out.println("Enter  side4 of trapezium:");
		 int s4=s1.nextInt();
		 
		 System.out.println("Enter height of trapezium:");
		 int h=s1.nextInt();
		 
		 int area_trapezium=h/2*(side1+side2);
		 
		 System.out.println("Area of trapezium is:" +area_trapezium);
         System.out.println("======================================");
		 
		 System.out.println("........CIRCUMFERENCE OF TRAPEZIUM........");
		 
		 System.out.println("Enter parallel side1 of trapezium:");
		  parallel_side1=s1.nextInt();
		 
		 System.out.println("Enter parallel side2 of trapezium:");
		 parallel_side2=s1.nextInt();
		 
		 System.out.println("Enter  side3 of trapezium:");
		 s3=s1.nextInt();
		 
		 System.out.println("Enter  side4 of trapezium:");
		 s4=s1.nextInt();
		 
		 int circum_trapezium=parallel_side1+parallel_side2+s3+s4;
		 System.out.println("Circumference of trapezium is:" +circum_trapezium);
		 
	}

}
