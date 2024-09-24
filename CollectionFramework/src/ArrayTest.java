//TEAR
//think + emotions = action + result

//100 - 80%

class Book
{
	private int bookId;
	private String bookName;
	private String bookAuthor;
	private int numberOfPages;
	private float bookPrice;
	private int edition;
	
	public Book(int bookId, String bookName, String bookAuthor, int numberOfPages, float bookPrice, int edition) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.numberOfPages = numberOfPages;
		this.bookPrice = bookPrice;
		this.edition = edition;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", numberOfPages="
				+ numberOfPages + ", bookPrice=" + bookPrice + ", edition=" + edition + "]";
	}
	
	public void showBook() {
		System.out.println("Book Number  : "+bookId);
		System.out.println("Book Name    : "+bookName);
		System.out.println("Book Author  : "+bookAuthor);
		System.out.println("Book Pages   : "+numberOfPages);
		System.out.println("Book Price   : "+bookPrice);
		System.out.println("Book Edition : "+edition);
		System.out.println("----------------------------------------");
	}
	
	
}




public class ArrayTest {
	public static void main(String[] args) {
		
		/*Book book1 = new Book(101,"Java Programming Language","James Gosling",1200,2000.0f,3);
		Book book2 = new Book(102,"C++ Programming Language","Bjarne Stroustup",800,1800.0f,1);
		Book book3 = new Book(103,"C Programming Language","Denis Ritchie",1100,1300.0f,2);
		Book book4 = new Book(104,"Oracle PL SQL","Edgar Frank",1500,2200.0f,4);
		Book book5 = new Book(105,"Unix Shell Scripting","Richard Stallman",900,1200.0f,5);
				
		System.out.println("book1 "+book1);
		System.out.println("book2 "+book2);
		System.out.println("book3 "+book3);
		System.out.println("book4 "+book4);
		System.out.println("book5 "+book5);
		*/
		
		Book bunch[] = new Book[10];
		
		
		bunch[0]  =  new Book(101,"Java Programming Language","James Gosling",1200,2000.0f,3);
		bunch[3]  = new Book(102,"C++ Programming Language","Bjarne Stroustup",800,1800.0f,1);
		bunch[5]  = new Book(103,"C Programming Language","Denis Ritchie",1100,1300.0f,2);
		bunch[8]  = new Book(104,"Oracle PL SQL","Edgar Frank",1500,2200.0f,4);
		bunch[9]  = new Book(105,"Unix Shell Scripting","Richard Stallman",900,1200.0f,5);
		
		for(int i=0;i<bunch.length;i++)
		{
			if(bunch[i]!=null) {
				System.out.println("SHOWING BOOK OF INDEX : "+i);;
				bunch[i].showBook();
			}
			else {
				System.out.println("BOOK IS NOT INITIALIZED AT INDEX : "+i);
			}
		}
		
		System.out.println("Showing 11th book");
		try {
			bunch[11].showBook(); //data is upto only 10 books  -- ARRAY CANNOT GROW AT RUNTIME
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Book at 11th index does not exists!!!!");
		}
		
		bunch[1] = new TextBook(106,"Maths I","Aryabhatta",3400,5300.0f,1);
		bunch[1].showBook();
		
		//bunch[2]= new Kitchen(); //CANNOT assign data other than Book and its Children
	}
}
class Kitchen
{
	
}
class TextBook extends Book {

	public TextBook(int bookId, String bookName, String bookAuthor, int numberOfPages, float bookPrice, int edition) {
		super(bookId, bookName, bookAuthor, numberOfPages, bookPrice, edition);
		// TODO Auto-generated constructor stub
	}
	
}
/*
				Stack
				
										----------------------------------------------------------------
										|101,"Java Programming Language","James Gosling",1200,2000.0f,3 |
										----------------------------------------------------------------
										200
										 |		   ----------------------------------------------------------------
										 |		   |102,"C++ Programming Language","Bjarne Stroustup",800,1800.0f,1 |
										 |		   ----------------------------------------------------------------
										 | 	       300
										 |			 |
										 ------------------------------------------
				+------------------------|200 |0   | 300 |0	 |0	 |0	 |0	 |0	 |0	|0	|
				|						 ----------------------------------------
				|					    100
				|						  0   1   2   3   4   5   6   7   8   9
				|
				|
			  100
			bunch[]

*/











