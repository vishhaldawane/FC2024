
public class KiteTest {
	public static void main(String[] args) {
		Kite k1 = new Kite("Prakash");
		Kite k2 = new Kite(120,"Green","Asawari");
		Kite k3 = new Kite("Red");
	
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
	
	{
		System.out.println("Is the sky clear to fly the kite? -- any ctor will follow it --");
		owner="Unknown";
		color="Unknown";
		length=-1;
	}
	
	Kite(int length) {
		System.out.println("Kite(int) ");
		this.length = length;
	}
	
	Kite(String color, int length) {
		System.out.println("Kite(String,int) ");
		this.color=color;	
	}
	
	Kite(String owner) {
		System.out.println("Kite(String) ");
		this.owner=owner;
	}
	
	
	
	public Kite(int length, String color, String owner) {
		super();
		System.out.println("Kite(int,String,String) ");

		this.length = length;
		this.color = color;
		this.owner = owner;
	}

	void fly() {
		System.out.println(owner+" is flying a kite of "+color+" Color and length "+length+" meter");
	}
	
}