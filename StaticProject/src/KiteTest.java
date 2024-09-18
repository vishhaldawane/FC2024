
public class KiteTest {
	
	
	static {
		System.out.println("2[ KiteTest's static block ]");
	}
	
	static {
		System.out.println("3[ KiteTest's static block ]");
	}
	
	static {
		System.out.println("1[ KiteTest's static block ]");
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("BEGIN MAIN ");

	

		Kite.showKiteCount();

		


		
		Kite k1 = new Kite("Prakash");
		Kite.showKiteCount();
		
		Kite k2 = new Kite(120,"Green","Asawari");
		Kite.printKiteCount();
		
		Kite k3 = new Kite("Red");
		Kite.printKiteCount();

		k1.fly();
		k2.fly();
		k3.fly();
		
		
		
	}
}

class Kite
{
	int length;
	String color;
	String owner;
	
	static int kiteCount=0; //single Copy
	
	static void showKiteCount() {
		System.out.println("TOTAL KITES IN THE SKY : "+kiteCount);
	}
	
	static void printKiteCount() { // u may run this NAMED static block many times
		System.out.println("TOTAL KITES IN THE SKY : "+kiteCount);
	}
	
	
	
	
	{ //annonymous non-static block called with EACH ctor call per object
		System.out.println("Is the sky clear to fly the kite? -- any ctor will follow it --");
		owner="Unknown";
		color="Unknown";
		length=-1;
		++kiteCount;
	}
	
	Kite(int length) {
		System.out.println("Kite(int) \n");
		this.length = length;
	}
	
	Kite(String color, int length) {
		System.out.println("Kite(String,int) \n");
		this.color=color;	
	}
	
	Kite(String owner) {
		System.out.println("Kite(String) \n");
		this.owner=owner;
	}
	
	static {//annonymous static block for the ENTIRE Kite class : runs only ONCE
		System.out.println("\n[ static block invoked ");
		System.out.println("SOME DB CONNECTION, some threads, some network initialization.....]\n");;
	}
	
	
	public Kite(int length, String color, String owner) {
		super();
		System.out.println("Kite(int,String,String) \n");

		this.length = length;
		this.color = color;
		this.owner = owner;
	}

	void fly() {
		System.out.println(owner+" is flying a kite of "+color+" Color and length "+length+" meter");
	}
	
}