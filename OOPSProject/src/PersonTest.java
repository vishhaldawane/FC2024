
public class PersonTest {
	public static void main(String[] args) {
		
//		Class	refToObj   allocator	constructor
		Person person1 	= 	new 		Person('F',"Asawari",20);
		Person person2 	= 	new 		Person('M',"Prakash",23);
		Person person3 	= 	new 		Person('F',"Mayuri",19);
		Person person4 	= 	new 		Person('M',"Avinash",22);
		Person person5 	= 	new 		Person('F',"Sonali",21);
		
		person1.think();
		person1.think(15);
		person1.think("Exam");
		person1.think(30, "Final Exam");
		person1.think("Prelims", 90);
		
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
		
		System.out.println("-----------");
		
		Student student = new Student('M',"Jack",22,1234,"Bharati Vidyapeeth",'A');
		student.attendClass();
		student.study();
		student.think();
		student.bookReading();
		student.think("The Bus");
		student.walking(100);
		student.workout(35);

		System.out.println("-----------");

		
		Employee employee = new Employee('F',"Julie",23,2234,"Vidyalankar College",'A',8899,"Four Colours Pvt. Ltd.",45000);
		employee.work();
		employee.attendMeetings();
		employee.attendClass();
		employee.study();
		employee.think();
		employee.bookReading();
		employee.think("The Bus");
		employee.walking(100);
		employee.workout(35);
		
		
	}
}
/*
 * 
 * 							Person person 	= 	new 		Person();

 * 					STACK									HEAP/Free Store
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
 * 
 * 		Student student = new Student('M',"Jack",22,1234,"Bharati Vidyapeeth",'A');

												|<------------Fields of the Student Object --------------------->
												FIELDS of the Person Object
 * 												|			|			|
 * 												gender		name		age		rollNumber  collegeName	grade
 * 												----------------------------------------------------------------------
 * 												|M		|Jack			|22	|		1234	|Bharati Vidya.|	A	|
 * 												----------------------------------------------------------------------
 * 			+---------------------------------->600
 * 			|
 * 			|									
 * 			600											Methods from Student
 * 			student
 * 															study() { }  attendClasses() { }
 * 
 * 
 * 		Employee employee = new Employee('F',"Julie",23,2234,"Vidyalankar College",'A',8899,"Four Colours Pvt. Ltd.",45000);

												
												|<--------------------------------Fields of the Employee -------------------------------------------------->
												|<------------Fields of the Student Object --------------------->
												FIELDS of the Person Object										|
 * 												|			|			|
 * 												gender		name		age		rollNumber  collegeName	grade			empno   companyname         salary
 * 												-----------------------------------------------------------------------------------------------------------
 * 												|F		|Julie			|23	|		2234	|Vidyalankar|	A	|	8844	  | FourColours Pvt.Ltd	|45000 |
 * 												-------------------------------------------------------------------------------------------------------------
 * 			+---------------------------------->700
 * 			|
 * 			|									
 * 			700											Methods from Employee
 * 			employee								
														work() { } attendMeetings() {}
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
	//OL1
	void 				think(    ) {
		System.out.println(name+" is thinking....");
	}
	
	//OL2
	void think(int minutes) {
		System.out.println(name+" is thinking....for "+minutes+" MINUTES");

	}
	//OL3
	void think(String herHisName) {
		System.out.println(name+" is thinking....of "+herHisName);

	}
	//OL4
	void think(int minutes , String herHisName) {
		System.out.println(name+" is thinking....of "+herHisName+ " for "+minutes+ " MINUTES");

	}
	//OL5
	void think(String herHisName, int minutes ) {
		System.out.println(name+" is thinking....of "+herHisName+ " for "+minutes+ " MINUTES");

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



class Student extends Person
{
	private int rollNumber;
	private String collegeName;
	private char grade;
	
	public Student(char g, String n, int a, int rollNumber, String collegeName, char grade) {
		super(g, n, a);
		this.rollNumber = rollNumber;
		this.collegeName = collegeName;
		this.grade = grade;
	}
	
	void study() {
		System.out.println("Student is studying.....");
	}
	
	void attendClass() {
		System.out.println("Student is attending classes....");
	}
}


class Employee extends Student
{
	private int empNumber;
	private String companyName;
	private float salary;
	
	public Employee(char g, String n, int a, int rollNumber, String collegeName, char grade, int empNumber,
			String companyName, float salary) {
		super(g, n, a, rollNumber, collegeName, grade);
		this.empNumber = empNumber;
		this.companyName = companyName;
		this.salary = salary;
	}

	void work() {
		System.out.println("Employee is studying.....");
	}
	
	void attendMeetings() {
		System.out.println("Employee is attending meetings....");
	}
}



















