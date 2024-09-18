
class Lab
{
	public static void process(Studying x) //Studying x = new Student();
	{
		System.out.println("Lab: process() invoked...");
		x.analyze();
		x.giveBirth();
		x.feel();
		x.personalize();
		x.stare();
		x.think();
		x.study();
	}
}
public class InterfaceTest {
	public static void main(String[] args) {
		
		Mammal mammal = new Mammal();
		Human   human = new Human();
		Person person = new Person();
		Student student = new Student(); //student obj has all methods
		
		//then also a student is ripped / sliced into this method
		//to restrict certain calls
		Lab.process(student);
		
		
		
		
		/*Thinking x = student;
		
		x.giveBirth();
		x.walk();
		x.think();
		x.feel();
		x.stare();
		x.analyze();
		x.giveVote();
		x.study();
		x.takeNotes();
		x.yawn();
		*/
		
		
		//Lab.process(student);
		
		/*Mammal mammal = new Mammal();
		mammal.giveBirth();
		mammal.walk();
		
		
		System.out.println("---------");
		
		Human human = new Human();
		human.giveBirth();
		human.walk();
		human.think();
		human.feel();
		human.stare();
		human.yawn();
		
		
		System.out.println("---------");
		
		Person person = new Student();
		person.giveBirth();
		person.walk();
		person.think();
		person.feel();
		person.stare();
		person.analyze();
		person.giveVote();
		person.yawn();
		
		System.out.println("---------");
		
		Student student = new Student();
		student.giveBirth();
		student.walk();
		student.think();
		student.feel();
		student.stare();
		student.analyze();
		student.giveVote();
		student.study();
		student.takeNotes();
		student.yawn();*/
		
	}
}
/*

					Mammal(c)
					  |giveBirth();
					  |walk();
					  |
					  |isA
					  |
			--------------------
			|
			| Thinking(i) Feeling(i)
			|  |think()	  |feel()
			|  |isA       |isA
			|  ------------
			|	|
			Human (c)
			|stare();
			|
			|isA
			|
			|  Analyzing (i)
			|   |analyze()
			|   |isA
			Person (c)
			|giveVote();
			|
			|isA
			|
			|
			|  Studying(i)
			|  |study()
			|  |isA
			Student (c)
			| takeNotes();
*/
class Mammal 
{
	void giveBirth() {
		System.out.println("Mamaml is giving birth...");
	}
	void walk() {
		System.out.println("A mammal is walking..");
	}
}

interface Thinking // all interfaces are pure abstract class
{
	void think(); // by default it is abstract and public
}

interface Feeling
{
	void feel();
}

interface Yawning
{
	void yawn();
}

class Human extends Mammal implements Thinking, Feeling, Yawning
{
	public void think() {
		System.out.println("Human can think...");
	}
	public void feel() {
		System.out.println("Human can feel...");
	}
	
	void stare() {
		System.out.println("Human is staring at someone....");
	}
	public void yawn() {
		System.out.println("Human is yawning...");
	}
	
}
interface X { }
interface Y { }
interface Z { }

interface A extends X,Y,Z
{
	void fun();
}

interface B extends A
{
	void foo();
}

class C implements B
{
	
}



interface Analyzing
{
	void analyze();
}
class Person extends Human implements Analyzing
{
	void personalize() {
		System.out.println("Can personalize the things....");
	}
	public void analyze() {
		System.out.println("Person is analyzing...");
	}
	void giveVote() {
		System.out.println("Person is voting....");
	}
}
interface Studying {
	void study();
}
class Student extends Person implements Studying
{
	public void study() {
		System.out.println("Student is studying....");
	}
	void takeNotes() {
		System.out.println("Student is taking notes....");
	}
}

