
public class PersonTest {
	public static void main(String[] args) {
		
		Person person = new Person();
		person.think();
		person.walking(500);
		float caloriesBurnt = person.workout(90);
		System.out.println("\tCalories burnt : "+caloriesBurnt);
		
		int pagesRead = person.bookReading();
		System.out.println("\tPerson read "+pagesRead+" PAGES...");
	}
}

class Person
{
	//1. function WITHOUT argument | WITHOUT return type
	
	//returnType				without arugment
	void 				think(    ) {
		System.out.println("1.Person is thinking....");
	}
	
	//use your imagination to make a similar function of category 1
	//MAKE IT HERE
	
	
	
	//2. function WITH argument | BUT WITHOUT return type
	void walking(int steps)
	{
		System.out.println("2.Person is walking "+steps+" STEPS...");
	}
	//use your imagination to make a similar function of category 2
	//MAKE IT HERE
		
	
	//3. function WITH arguments | AND WITH return type [ int here ]
	float workout(int minutes)
	{
		System.out.println("3.Person doing workout for "+minutes+" MINUTES");
		return minutes*3.5f; // x calories burnt out
	}
	
	//use your imagination to make a similar function of category 3
	//MAKE IT HERE
		
	
	//4. function WITHOUT argument | BUT WITH return type
	int bookReading() {
		System.out.println("4.Person read the book .....");
		return 30; //number of pages read | or time took in mnts to read
	}
	
	//use your imagination to make a similar function of category 4
	//MAKE IT HERE
		
}
























