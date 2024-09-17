
public class CircleTest {
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(10);
		Circle circle2 = new Circle(20);
		Circle circle3 = new Circle(30);
		
		System.out.println("circle1 :"+circle1);
		System.out.println("circle2 :"+circle2);
		System.out.println("circle3 :"+circle3);
		
		Car myCar1 = new Car("AKDJFHG6475IOK","MH-01-PO-9922",4550);
		Car myCar2 = new Car("UTYGHGD3475IJH","MH-12-XO-1912",9550);
		Car myCar3 = new Car("WERYERS2465ILK","MH-05-WQ-7942",3550);
		
		System.out.println("myCar1 : "+myCar1);
		System.out.println("myCar2 : "+myCar2);
		System.out.println("myCar3 : "+myCar3);

		
			
	}
}
class Car
{
	final String chasisNumber; //uique + immutable + NON-shared
	final String numberPlate; 
	int kilometersDriven; //during each drive it will change
	
	
	//ctor is called only ONCE
	public Car(String chasisNumber, String numberPlate, int kilometersDriven) {
		super();
		this.chasisNumber = chasisNumber; //set only ONCE
		this.numberPlate = numberPlate;
		this.kilometersDriven = kilometersDriven;
	}
	
	

	public int getKilometersDriven() {
		return kilometersDriven;
	}



	public void setKilometersDriven(int kilometersDriven) {
		this.kilometersDriven = kilometersDriven;
	}



	public String getChasisNumber() {
		return chasisNumber;
	}

	//setter can be invoked many times, hence cannot allow to set chasis many times
	//public void setChasisNumber(String newChasis) {
//		 chasisNumber = newChasis;
//	}

	public String getNumberPlate() {
		return numberPlate;
	}



	@Override
	public String toString() {
		return "Car [chasisNumber=" + chasisNumber + ", numberPlate=" + numberPlate + ", kilometersDriven="
				+ kilometersDriven + "]";
	}
	
	
	
	
	
	
	
}
class Circle
{
	int radius;
	float area;
	static final float PI=3.14f; // it is a field + immutable + single copy
	
	public Circle(int radius) {
		super();
		this.radius = radius;
		this.area = PI * radius * radius;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + "]";
	}
	
	
}

/*
 
 	below diagram is for : final float PI=3.14f;
 	
  									radius		area		PI
  									-----------------------------
  									|10		|	314		| 3.14	 |
  									-------------------------------
  			+-----------------------> 100
  			|
  	circle1

    									radius		area		PI
  									-----------------------------
  									|20		|	1256	| 3.14 	|
  									-------------------------------
  			+-----------------------> 200
  			|
  	circle2


  									radius		area		PI
  									-----------------------------
  									|30		|	2826.00	| 3.14	 |
  									-------------------------------
  			+-----------------------> 300
  			|
  	circle3
  	
  	-----
  	
  	below diagram is for : static final float PI=3.14f;
 	
 	
 		stack						heap
 			|						|
 			
 			
 	pool = common data
 
 coffee vending machine
 	|
 empty paper cups
 50/60 cups in the POOL
 
 
 
  
 		PI<--universal constant
 		3.14
  									radius		area	
  									---------------------
  									|10		|	314		| 
  									---------------------
  			+-----------------------> 100
  			|
  	circle1

    									radius		area
  									---------------------
  									|20		|	1256	| 
  									---------------------
  			+-----------------------> 200
  			|
  	circle2


  									radius		area	
  									--------------------
  									|30		|	2826.00	| 
  									---------------------
  			+-----------------------> 300
  			|
  	circle3

 */
