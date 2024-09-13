
public class PointTest {
	public static void main(String[] args) {
		
		Point2D p1 = new Point2D(40,30);
		p1.showPoint();
		System.out.println("----------");
		
		Point3D p2 =new Point3D(20,40,35);
		p2.showPoint();
	}
}
/*
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

 */
class Point2D
{
	int x;
	int y;
	
	Point2D(int a, int b) {
		System.out.println("Point2D(int,int) ctor");
		x = a;
		y = b;
	}
	void showPoint() {
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
}
class Point3D extends Point2D
{
	int z; // x and y are also here in this class
	
	Point3D(int a, int b, int c) { //Point3D ctor must invoke Point2D ctor
		super(a,b); //REUSE super class ctor to initialize the x and y of this class
		System.out.println("Point3D(int,int,int) ctor");
		z = c;
	}
	void showPoint() {
		super.showPoint(); // invoke super class's function - REUSE
		System.out.println("z "+z);
		
	}
}








