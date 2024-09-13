
public class PersonTest {
	public static void main(String[] args) {
		
//		Class	refToObj   allocator	constructor
		Person person1 	= 	new 		Person('F',"Asawari",20);
		Person person2 	= 	new 		Person('M',"Prakash",23);
		Person person3 	= 	new 		Person('F',"Mayuri",19);
		Person person4 	= 	new 		Person('M',"Avinash",22);
		Person person5 	= 	new 		Person('F',"Sonali",21);
		
		person1.think();
		person1.walking(500);
		float caloriesBurnt = person1.workout(90);
		System.out.println("\tCalories burnt : "+caloriesBurnt);
		
		int pagesRead = person1.bookReading();
		System.out.println("\tPerson read "+pagesRead+" PAGES...");
		
		person2.walking(150);
		person3.walking(250);
		person2.bookReading();
		person4.walking(350);
		person3.workout(45);
		person5.walking(650);

	}
}
/*
 * 
 * 							Person person 	= 	new 		Person();

 * 					STACK									HEAP
 * 
 * 												FIELDS of the Person Object
 * 												|			|			|
 * 												gender		name		age
 * 												--------------------------------
 * 												|F		|Asawari		|20		|
 * 												---------------------------------
 * 			+---------------------------------->100
 * 			|
 * 			|									METHOD area of the Person Object
 * 			100				
 * 			person1								Person() { }
 * 												think(){}
 * 												walking(int){}
 * 												float workout(int)	{}
 * 												int bookReading(){}		
 * 	person1.think()		
 *  person2.think()
 * 
 * 												FIELDS of the Person Object
 * 												|			|			|
 * 												gender		name		age
 * 												--------------------------------
 * 												|M			|Prakash	|23		|
 * 												---------------------------------
 * 			+---------------------------------->200
 * 			|
 * 			|									
 * 			200				
 * 			person2
 * 
 * 												FIELDS of the Person Object
 * 												|			|			|
 * 												gender		name		age
 * 												--------------------------------
 * 												|F			|Mayuri		|19		|
 * 												---------------------------------
 * 			+---------------------------------->300
 * 			|
 * 			|									
 * 			300				
 * 			person3
 * 
 * 
 * 												FIELDS of the Person Object
 * 												|			|			|
 * 												gender		name		age
 * 												--------------------------------
 * 												|M		|Avinash		|22		|
 * 												---------------------------------
 * 			+---------------------------------->400
 * 			|
 * 			|									
 * 			400				
 * 			person4
 * 
 * 												FIELDS of the Person Object
 * 												|			|			|
 * 												gender		name		age
 * 												--------------------------------
 * 												|F		|Sonali			|21	|
 * 												---------------------------------
 * 			+---------------------------------->500
 * 			|
 * 			|									
 * 			500				
 * 			person5
 * 
 * 
 * 								
 */
class Person
{
	private char gender;
	private String name;
	private int age;
	
	Person() {
		System.out.println("Person constructor....invoked....");
	}
	
	Person(char g, String n, int a) {
		System.out.println("Person(char,String,int) constructor....invoked....");
		gender = g;
		name = n;
		age = a;
	}
	
	//1. function WITHOUT argument | WITHOUT return type
	
	//returnType				without arugment
	void 				think(    ) {
		System.out.println(name+" is thinking....");
	}
	
	//use your imagination to make a similar function of category 1
	//MAKE IT HERE
	
	
	
	//2. function WITH argument | BUT WITHOUT return type
	void walking(int steps)
	{
		System.out.println(name+" is walking "+steps+" STEPS...");
	}
	//use your imagination to make a similar function of category 2
	//MAKE IT HERE
		
	
	//3. function WITH arguments | AND WITH return type [ int here ]
	float workout(int minutes)
	{
		System.out.println(name+" is doing workout for "+minutes+" MINUTES");
		return minutes*3.5f; // x calories burnt out
	}
	
	//use your imagination to make a similar function of category 3
	//MAKE IT HERE
		
	
	//4. function WITHOUT argument | BUT WITH return type
	int bookReading() {
		System.out.println(name+" read the book .....");
		return 30; //number of pages read | or time took in mnts to read
	}
	
	//use your imagination to make a similar function of category 4
	//MAKE IT HERE
		
}
























