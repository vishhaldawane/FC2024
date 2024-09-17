package jungle.cave;

public class Tiger {
	void roar() {
		System.out.println("Tiger is roaring...");
	}
}
class Lion {
	void roar() {
		Bear b = new Bear();
		b.climb();
		b.hatchHoney();
		System.out.println("Lion is roaring...");
	}
}
class Bear {
	void climb() {
		System.out.println("Bear is climbing upon the tree...");
	}
	void hatchHoney() {
		System.out.println("Hatching Honey from the Beehive");
	}
}

