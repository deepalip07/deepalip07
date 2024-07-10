package JavaPracticeProjects;

abstract class Shape
{
	abstract void draw();
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle"); 
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}

public class Abstract_class {

	public static void main(String[] args) 
	{
		Shape s =new Circle();
		s.draw();
		

	}

}
