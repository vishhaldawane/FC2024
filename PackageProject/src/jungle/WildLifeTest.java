package jungle;

import jungle.river.Fish; //avail the class in the current code
import jungle.river.Frog;
import jungle.river.Tortoise;
import jungle.tree.Monkey;

public class WildLifeTest {
	public static void main(String[] args) {
		Frog theFrog = new Frog();
		theFrog.jump();
		Fish fish = new Fish();
		fish.swim();
		Tortoise tort = new Tortoise();
		tort.swim();
		tort.walking();
		
		Monkey mon = new Monkey();
		
	}

}
