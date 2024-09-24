import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		
		Book book1 = new Book(101,"Java Programming Language","James Gosling",1200,2000.0f,3);
		Book book2 = new Book(102,"C++ Programming Language","Bjarne Stroustup",800,1800.0f,1);
		Book book3 = new Book(103,"C Programming Language","Denis Ritchie",1100,1300.0f,2);
		Book book4 = new Book(104,"Oracle PL SQL","Edgar Frank",1500,2200.0f,4);
		Book book5 = new Book(105,"Unix Shell Scripting","Richard Stallman",900,1200.0f,5);
				
		
//		Book            bunch[] = new Book[10];
		
		//CONTAINER
		ArrayList<Book> bunch = new ArrayList<>(); //no size - 10 is the size
			
		//keep on appending the book - DATA TYPE
		bunch.add(new Book(101,"Java Programming Language","James Gosling",1200,2000.0f,3));
		bunch.add(new Book(102,"C++ Programming Language","Bjarne Stroustup",800,1800.0f,1));
		bunch.add(new Book(103,"C Programming Language","Denis Ritchie",1100,1300.0f,2));
		bunch.add(new Book(104,"Oracle PL SQL","Edgar Frank",1500,2200.0f,4));
		bunch.add(new Book(105,"Unix Shell Scripting","Richard Stallman",900,1200.0f,5));
		
		
		//ITERATOR
		for(int i=0;i<bunch.size();i++)
		{
				System.out.println("SHOWING BOOK OF INDEX : "+i);
				Book currentBook = bunch.get(i);	
				System.out.println("Current Book : "+currentBook);
		}
			
		
		
		System.out.println(" ------ Adding a new Book ------  ");
		
		bunch.add(new TextBook(106,"Maths I","Aryabhatta",3400,5300.0f,1));
		
		for(int i=0;i<bunch.size();i++)
		{
				System.out.println("SHOWING BOOK OF INDEX : "+i);
				Book currentBook = bunch.get(i);	
				System.out.println("Current Book : "+currentBook);
		}
			
		
		//bunch.add(new Kitchen()); //CANNOT assign data other than Book and its Children
	}
}











