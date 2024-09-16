
public class HasATest {
	public static void main(String[] args) {
	
		Car myCar1 = new Car("Swift");
		Car myCar2 = new Car("Skoda");
		Car myCar3 = new Car("Volvo");
		
		myCar1.startTheCar();
		myCar1.drive();
		myCar1.stopTheCar();
		
		
		
	}
}

class Engine
{
	int numberOfCylinders;

	public Engine(int numberOfCylinders) {
		super();
		this.numberOfCylinders = numberOfCylinders;
	}

	void startTheEngine() {
		System.out.println("Starting the engine.....");
	}
	
	void stopTheEngine() {
		System.out.println("Stopping the engine....");
	}
	
}

class ReportCard { }

class Student extends ReportCard
{
	
}


class Vehicle //abstract class 
{
	void drive() {
		System.out.println("Driving the vehicle....");
	}
}
/*
class Cycle extends Vehicle {
	
}
*/

class Wheel {
	
}
//The WHOLE entity
class Car extends Vehicle //isA - aggregation
{
	String model;
	
	//Engine is the PART of the Car - Composition
	Engine engine = new Engine(4); //hasA - look HERE - it is a data member - field
	Wheel wheel1 = new Wheel();
	Wheel wheel2 = new Wheel();
	Wheel wheel3 = new Wheel();
	Wheel wheel4 = new Wheel();
	Wheel spareWheel = new Wheel(); 
	
	
	
	Car(String mod) {
		model = mod;
	}
	
	void startTheCar() {
		System.out.println(model+ " Car is started....");
	}
	
	void drive() { //same function as of the parent BUT with different contract
		System.out.println(model+" Car....is being driven....");
	}
	
	void stopTheCar() {
		System.out.println(model+" Car is stopped....");
	}
}
/*
class ElectricCar extends Car //isA
{
	
}
*/

/*


		Knowledge ---> Apply  ----> Wisdom
		

*/