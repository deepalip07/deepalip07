package JavaPracticeProjects;

interface Polygon
{
	 void getArea();
}


class Rectangle1 implements Polygon
{

   public void getArea() 
   {
		int length=10;
		int breadth=20;
		int area_rectangle=length*breadth;
		System.out.println("Area of rectangle is: " +area_rectangle);
		//System.out.println();
	}

}

class Square implements Polygon
{
	public void getArea() 
	{
		int side=20;
		int area_square=side*side;
		System.out.println("Area of Square is:" +area_square);
	}
	
}
public class Interface2_Ex 
{

	public static void main(String[] args) 
	{
		Rectangle1 r1=new Rectangle1() ;
		Square s=new Square();
  
	    r1.getArea();
         s.getArea();
       
 }

}
