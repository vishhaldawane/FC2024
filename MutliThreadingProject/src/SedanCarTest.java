
public class SedanCarTest {
	public static void main(String[] args) {
		//Running running = new Running();
		/*SedanCar car = new SedanCar(); //3
		Truck truck = new Truck(); //3
		Bike bike = new Bike(); //3
		
		car.start();
		truck.start();
		bike.start();
		*/
		
		Male male1 = new Male("Rajesh"); //3
		Male male2 = new Male("\tRamesh"); //3 
		Male male3 = new Male("\t\tYogesh"); //3
		
		
		Thread t1  = new Thread(male1); //4
		Thread t2  = new Thread(male2); //4
		Thread t3  = new Thread(male3); //4
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
//CPU <-- car, truck, bike
//time slicing
//round robin basis
//70 lines car, 80 trucks, 20
//

class Mammal
{
	void giveBirth() {
		System.out.println("Mammal is Giving Birth...");
	}
}
class Human
{
	void think() {
		System.out.println("Human is Think...");
	}
	
}
class Male extends Human implements Runnable //1
{
	String name;
	
	Male(String name) {
		this.name = name;
	}
	void protect() {
		for(int i=1;i<=100;i++) {
			think();
			System.out.println(name+ " Male is protecting..."+i);
		}
	}
	public void run() { //2. mandatory
		protect();
	}
}







class SedanCar extends Thread //1. Thread is from java.lang [ by default import ]
{
	public void run() { //2
		for(int i=1;i<=300;i++) {
			System.out.println("Sedan Car is running....."+i);
	
		}
	}
}


class Truck extends Thread
{
	public void run() {
		for(int i=1;i<=500;i++) {
			System.out.println("\tTruck is running....."+i);
	
		}
	}
}


class Bike extends Thread
{
	public void run() {
		for(int i=1;i<=50;i++) {
			System.out.println("\t\tBike is running....."+i);
	
		}
	}
}





/*
          //Runnable
interface Running
{
	void run();
}

     //Thread
class Car implements Running
{
	public void run() { // implemented function
		System.out.println("Car is running...");
	}
	
	public void start() { //exclusive function
		System.out.println("Car is started...");
		run(); //run() is called from here
	}
}
class SedanCar extends Car //maruti swift Dzire
{
	public void start() { //exclusive function
		System.out.println("SedanCar is started...");
		run(); //run() is called from here
	}
	
	public void run() { // implemented function
		System.out.println("SedanCar is running...");
	}
}
*/







