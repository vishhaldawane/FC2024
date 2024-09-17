package jungle.tree;

public class Monkey {
	void jump() {
		Parrot p = new Parrot();
		p.fly();
		Sparrow s = new Sparrow();
		s.chirp();
		System.out.println("Monkey is jumping...");
	}
}