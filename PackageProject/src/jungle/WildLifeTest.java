package jungle;

import jungle.river.Fish; //avail the class in the current code
import jungle.river.Frog;
import jungle.river.Tortoise;
import jungle.tree.Monkey;

public class WildLifeTest {
	public static void main(String[] args) {
		Frog theFrog = new Frog();
		theFrog.jump();
		
		System.out.println("default   : "+theFrog.defaultA);
		System.out.println("private   : "+theFrog.privateB);
		System.out.println("protected : "+theFrog.protectedC);
		System.out.println("public    : "+theFrog.publicD);
		
		
		
	}

}
