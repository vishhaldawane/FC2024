
public class WashingMachineTest {
	public static void main(String[] args) {
		
		WashingMachine samsungMachine = new WashingMachine();
		
		
		samsungMachine.wash();
		
	}
}


class Tub
{
	
}
class WashingTub extends Tub
{
	void spin() {
		System.out.println("Washing Tub is spinning.....");
	}
}

class Machine
{
	
}

class WashingMachine extends Machine //isA
{
	//hasA
	private WashingTub theTub = new WashingTub();
	
	void wash() {
		System.out.println("Washing machine is washing...");
		theTub.spin();
	}
}