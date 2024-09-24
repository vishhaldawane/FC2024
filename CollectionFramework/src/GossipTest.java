
public class GossipTest {
	public static void main(String[] args) {
		
		Girl girl1 = new Girl("Sonali");
		Girl girl2 = new Girl("Shweta");
		Girl girl3 = new Girl("Mayuri");
		
		girl1.talk();
		girl2.discuss(girl3); //passing object as an argument
		
		girl3.gossip(girl1, girl2);
	}
}

class Girl
{
	String name;
	
	Girl(String n) {
		name = n;
	}
	void talk() {
		System.out.println(name+ " is talking...with herself ");
	}
	
	
	void discuss(Girl girlRef) {
		System.out.println(name+ " is discussing...with "+girlRef.name);
	}
	
	void gossip(Girl g1, Girl g2) {
		System.out.println(name+" is gossiping with "+g1.name+ " and "+g2.name);
	}
}
