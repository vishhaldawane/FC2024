import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class ArrayListTest {
	public static void main(String[] args) {
		
		//CONTENT - X
		/*Book book1 = new Book(101,"Java Programming Language","James Gosling",1200,2000.0f,3);
		Book book2 = new Book(102,"C++ Programming Language","Bjarne Stroustup",800,1800.0f,1);
		Book book3 = new Book(103,"C Programming Language","Denis Ritchie",1100,1300.0f,2);
		Book book4 = new Book(104,"Oracle PL SQL","Edgar Frank",1500,2200.0f,4);
		Book book5 = new Book(105,"Unix Shell Scripting","Richard Stallman",900,1200.0f,5);*/
		System.out.println("Content is ready...");		
		
//		Book            bunch[] = new Book[10];
		
		//CONTAINER - Y
	//	ArrayList<Book> bunch = new ArrayList<>(); //no size - 10 is the size
	//	LinkedList<Book> bunch = new LinkedList<>(); //no size - 10 is the size
	
	//	HashSet<Book> bunch = new HashSet<>(); //no size - 10 is the size
		
		TreeSet<Book> bunch = new TreeSet<Book>(); //no size - 10 is the size
		System.out.println("Container is ready...");		

	//  LinkedList
	//  HashSet
	//  TreeSet
		
		
		//knowing the PATH and WALKING the PATH are two different things
		
		System.out.println("trying to add content in the container...");		

		//keep on appending the book - DATA TYPE
		System.out.println("adding 1st book...");
		bunch.add(new Book(110,"Java Programming Language","James Gosling",1200,2000.0f,3));
		
		System.out.println("adding 2nd book...");
		bunch.add(new Book(105,"C++ Programming Language","Bjarne Stroustup",800,1800.0f,1));

		System.out.println("adding 3rd book...");
		bunch.add(new Book(109,"C Programming Language","Denis Ritchie",1100,1300.0f,2));

		System.out.println("adding 4th book...");
		bunch.add(new Book(120,"Oracle PL SQL","Edgar Frank",1500,2200.0f,4));
		
		System.out.println("adding 5th book...");
		bunch.add(new Book(115,"Unix Shell Scripting","Richard Stallman",900,1200.0f,5));
		
		
		//ITERATOR
		/*for(int i=0;i<bunch.size();i++)// for  (i=450; i<=550;i++) //out of 0 to 1000
		{
				System.out.println("SHOWING BOOK OF INDEX : "+i);
				Book currentBook = bunch.get(i);	
				System.out.println("Current Book : "+currentBook);
		}*/
		
		//STRAW - I
		Iterator<Book> bunchIterator  = bunch.iterator(); //full iteration, lowest to highest
		
		while(bunchIterator.hasNext()) {
			Book theBook = bunchIterator.next();
			System.out.println("Current Book : "+theBook);

		}
			
		
		
		System.out.println(" ------ Adding a new Book ------  ");
		
		bunch.add(new TextBook(106,"Maths I","Aryabhatta",3400,5300.0f,1));
		
		bunchIterator  = bunch.iterator(); //full iteration, lowest to highest
		
		while(bunchIterator.hasNext()) {
			Book theBook = bunchIterator.next();
			System.out.println("Current Book : "+theBook);

		}
			
		
		//bunch.add(new Kitchen()); //CANNOT assign data other than Book and its Children
	}
}











