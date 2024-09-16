
public class PointTest {
	public static void main(String[] args) {
		
		Point2D p1 = new Point2D(40,30);
		p1.showPoint();
		
		System.out.println("----------");
		
		Point3D p2 =new Point3D(20,40,35);
		p2.showPoint();
		
		System.out.println("----------");

		ColouredPoint3D p3 = new ColouredPoint3D(56,78,34,"Green");
		p3.showPoint();
	}
}
/*
 * 
 * 
 * 	Person
 *     | gender,age,name
 *     |
 *  Student
 *     | rollno,grade,college
 *     |
 *  Employee
 *     | empno,desg,companyName,salary
 *     
 *     
 *  
 *  
 * 						Point2D
 * 							| [ x,y,ctors,showPoint ]
 * 			-------------------------
 * 				|
 * 	single			Point3D
 * 				| [  [x,y,ctors ] + z, ctor, showPoint  ]
 * 		----------------------
 * 		|  
 *  ColouredPoint3D <-- multi-level
 * 			[ [ [ x,y,ctors ] , + z, ctor ], + col, showPoint ]
 * 
 * 
 * 
 * Point2D
 *  Y
 * 	50|
 * 	40|
 * 	30|---------. <-- (x,y) 40,30
 * 	20|			|
 *  20|			|
 * 	  +---------------> X
 *     10 20 30 40 50
 * 

 * Point3D
 *  Y			
 * 	50|     Z
 * 	40|----+ <--- (20,40,35);
 * 	30|   /|
 * 	20|	 / |		
 *  20|	/  |		
 * 	  +---------------> X
 *     10 20 30 40 50


 * ColouredPoint3D
 *  Y			
 * 	50|     Z
 * 	40|----+ <--- (20,40,35,"Green");
 * 	30|   /|
 * 	20|	 / |		
 *  20|	/  |		
 * 	  +---------------> X
 *     10 20 30 40 50

 */
class Point2D //<--- Generalization
{
	private int x;
	private int y;
	
	Point2D(int a, int b) {
		System.out.println("Point2D(int,int) ctor");
		x = a;
		y = b;
	}
	void showPoint() { //overridden method is in the PARENT
		System.out.println("x   : "+x);
		System.out.println("y   : "+y);
	}
}
//super() to invoke a ctor of the nearest parent from a ctor
//super.  to refer any accessible super class data OR function


//every Point3D is a Point2D too
//But not other way round, means, Every Point2D is not a Point3D

class Point3D extends Point2D // <-- Specialization of Generalization
{
	private int z; // x and y are also here in this class
	
	Point3D(int a, int b, int c) { //Point3D ctor must invoke Point2D ctor
		super(a,b); //REUSE super class ctor to initialize the x and y of this class
		System.out.println("Point3D(int,int,int) ctor");
		z = c;
	}
	void showPoint() { //overriding method is in the CHILD
		super.showPoint(); // invoke super class's function - REUSE
		System.out.println("z   : "+z);	
	}
}
class ColouredPoint3D extends Point3D //Specialization of Specialization
{
	private String color; // x and y are also here in this class
	
	 ColouredPoint3D (int a, int b, int c,String col) { //Point3D ctor must invoke Point2D ctor
		super(a,b,c); //REUSE super class ctor to initialize the x and y of this class
		System.out.println("ColouredPoint3D(int,int,int,String) ctor");
		color = col;
	}
	void showPoint() {
		super.showPoint(); // invoke super class's function - REUSE
		System.out.println("col : "+color);
		
		
	}
}







