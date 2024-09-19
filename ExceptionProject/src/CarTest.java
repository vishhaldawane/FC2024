
public class CarTest {
	public static void main(String[] args) {
		System.out.println("Begin main\n");
		
		try {
			Car car = new Car();
			car.longDrive();
		}
		catch(RuntimeException e) {
			System.out.println("Caught the thrown object here : "+e);
		}
		System.out.println("\nEnd main");
		
	}
}

class Car
{
	void longDrive()
	{
		for(int i=1;i<=25;i++) {
			System.out.println("Kilometers driven..."+i);
			
			double v = Math.random()%10;
			
			if(v > 0.50 && v <0.55) {
				//System.out.println("\tTyre Punctured...");
				RuntimeException runTimeException = new RuntimeException("Tyre Punctured...");
				throw runTimeException;
			}
		}
	}
}