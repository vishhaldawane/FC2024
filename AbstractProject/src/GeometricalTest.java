
public class GeometricalTest {
	public static void main(String[] args) {
	
		//GeometricalShape shape = new GeometricalShape();
		
		Circle circle1 = new Circle(45);
		circle1.draw();
		circle1.calcArea();
		
		System.out.println("----------");
		
		Square square = new Square(45);
		square.draw();
		square.calcArea();
		
		System.out.println("----------");
		
		
		Triangle triangle = new Triangle(45,90);
		triangle.draw();
		triangle.calcArea();
		
	}
}

/* abstract class

			- may or may not have abstract methods
			
			- it is MEANT for inheritance
			
			- the immediate non-abstract class MUST implement the abstract
			  method of this class
			  
			- Abstract class cannot be instantiated
			
			- the main purpose of abstract class is to impose some
			business principles on the upcoming child class/es
			  
*/

abstract class BankAccount
{
	
}
abstract class GeometricalShape
{
	abstract void draw(); //abstract | incomplete | partial contract
	abstract void calcArea();
	
}
class Circle extends GeometricalShape
{
	float radius;
	private static final float PI=3.14f;
	
	Circle(float r) {
		radius = r;
	}
	
	void draw() { //mandatory development of this method
		System.out.println("Circle : draw() is mandatorily implemented");
	}
	void calcArea() {
		System.out.println("Circle : calcArea() : Calculating the area of the Circle....");
		float area = PI * radius * radius;
		System.out.println("Circle : area       : "+area);
	}
}

//Rectangle, Square, Triangle, Circle, Ellipse ...
class Square extends GeometricalShape
{
	float side;
	
	Square(float r) {
		side = r;
	}
	
	void draw() { //mandatory development of this method
		System.out.println("Square : draw() is mandatorily implemented");
	}
	void calcArea() {
		System.out.println("Square : calcArea() : Calculating the area of the Square....");
		float area = side * side;
		System.out.println("Square : area       : "+area);
	}
}

class Triangle extends GeometricalShape
{
	float base;
	float height;
	
	Triangle(float b, float h) {
		base = b;
		height = h;
		
	}
	
	void draw() { //mandatory development of this method
		System.out.println("Triangle : draw() is mandatorily implemented");
	}
	void calcArea() {
		System.out.println("Triangle : calcArea() : Calculating the area of the Triangle....");
		float area = 0.5f * base * height;
		System.out.println("Triangle : area       : "+area);
	}
}
/*
class Ellipse extends Circle
{
	//No, it is NOT compulsory for the grand child [ non-abstract class ]
	//to develope the draw() method
}
*/




