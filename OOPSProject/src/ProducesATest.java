
public class ProducesATest {

	/* 
	 * AAKASH - SKY
	 * 
	 * AIR
	 * 
	 * FIRE
	 * 
	 * WATER - flow - never stops on obstacles 
	 * 
	 * EARTH - stability <-- COW is Stable 
	 * 
	 * MILK <---   GHEE
	 * 
	 * 
	 
	 TRANSCENDETAL TO YOUR STATE OF CONSCIOUSNESS
	 
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Milk milk = new Milk("Cow","OffWhite","Thin",2); //GirCow A2 milk
	
		CurdCulture cc = new CurdCulture(50,8); // 50 is in gm, 5 is in million
	
		//Curd curd = new Curd(); //traditional or usual approach
		
		Curd curd = milk.coagulate(cc); //telling milk to product curd with  | COAGUALTE
									// the help of curd culture
		
		System.out.println("Curd is : "+curd); // TRANSMUTATION OF THE MILK
		
		Butter butter = curd.churn(30);					// CHURNING <-- AIR
		
		System.out.println("Butter : "+butter);
		
		ClarifiedButter ghee = butter.boil(10);			 // BOIL <-- FIRE
		
		System.out.println("Ghee : "+ghee);
	}

}
class Curd
{
	private float quantity;
	private String thickNess;
	private String sourLevel;
	public Curd(float quantity, String thickNess, String sourLevel) {
		super();
		this.quantity = quantity;
		this.thickNess = thickNess;
		this.sourLevel = sourLevel;
	}
	@Override
	public String toString() {
		return "Curd [quantity=" + quantity + ", thickNess=" + thickNess + ", sourLevel=" + sourLevel + "]";
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getThickNess() {
		return thickNess;
	}
	public void setThickNess(String thickNess) {
		this.thickNess = thickNess;
	}
	public String getSourLevel() {
		return sourLevel;
	}
	public void setSourLevel(String sourLevel) {
		this.sourLevel = sourLevel;
	}
	
	Butter churn(int minutes) {
		System.out.println("Churning the "+quantity+" KG of curd for "+minutes+" Minutes to produce the Butter....");
		String butterColor="";
		
		if(thickNess.contains("thin"))
			butterColor="yellowish";
		else 		if(thickNess.contains("thick"))
			butterColor="whiteish";

			
		Butter butter = new Butter(butterColor,(quantity/3));
		return butter;
	}
	
}

class ClarifiedButter
{
	private float quantity;
	private String type;
	private String density;
	
	public ClarifiedButter(float quantity, String type, String density) {
		super();
		this.quantity = quantity;
		this.type = type;
		this.density = density;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDensity() {
		return density;
	}
	public void setDensity(String density) {
		this.density = density;
	}
	
	@Override
	public String toString() {
		return "ClarifiedButter [quantity=" + quantity + ", type=" + type + ", density=" + density + "]";
	}
	
	
	
}

class Butter
{
	private String color;
	private float quantity;
	
	public Butter(String color, float quantity) {
		super();
		this.color = color;
		this.quantity = quantity;
	}
	
	ClarifiedButter boil(int mnts) {
		System.out.println("Boiling "+color+" color Butter of quantity "+quantity+" KG to produce GHEE");
		String gheeColor="";
		String density="";
		
		if(color.contains("yellow")) {
			gheeColor="GoldenYellow";
			density="Flowing";
		}
		else
			if(color.contains("white")) {
				gheeColor="PureWhite";
				density="Think And Fat";

			}
				
		ClarifiedButter ghee = new ClarifiedButter((quantity/2),gheeColor,density);
		return ghee;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Butter [color=" + color + ", quantity=" + quantity + "]";
	}
	
	
	
}
class Almond
{
	
}

class Milk {
	private String type; // cow,buffalow, goat
	private String color; // offwhite, white
	private String density; // thin, thick
	private int quantity; // 3 ltr, 5 ltr etc

	public Milk(String type, String color, String density, int quantity) {
		super();
		this.type = type;
		this.color = color;
		this.density = density;
		this.quantity = quantity;
	}
	
	
	BadamMilk createHealthyDrink(Almond almond[]) {
		
	}
	
	// producesA //usesA
		Curd coagulate(CurdCulture cc) {
			System.out.println("Creating curd from the "+type+"'s "+color+" milk of "+quantity+" ltr quantity");
			System.out.println("Using a curd culture : "+cc.getQuantity()+" gm of bacteria count : "+cc.getBacteria()+" millions");
			
			String sourLevel="";
			
			if(cc.getBacteria() >=1 && cc.getBacteria()<=5) 
				sourLevel="Sour";
			if(cc.getBacteria() >5 && cc.getBacteria()<=10) 
				sourLevel="Little Sour";
			if(cc.getBacteria() >10 ) 
				sourLevel="Too Sour";
			
			String density="";
			if(type.equalsIgnoreCase("Cow"))
				density="thin";
			else if(type.equalsIgnoreCase("Buffalow"))
				density="thick";
			
			float curdQty=0;
			
			if(quantity ==1 )
				curdQty = quantity / 1.09f;
			else if(quantity==2)
				curdQty = quantity / 1.1f;
			
			Curd curd = new Curd(curdQty,density,sourLevel); // local object
			return curd; //the promise of this function to return Curd's object
		}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getDensity() {
		return density;
	}

	public void setDensity(String density) {
		this.density = density;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

}

class CurdCulture {
	private int quantity;
	private int bacteria; // good one to make the curd

	public CurdCulture(int quantity, int bacteria) {
		super();
		this.quantity = quantity;
		this.bacteria = bacteria;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getBacteria() {
		return bacteria;
	}

	public void setBacteria(int bacteria) {
		this.bacteria = bacteria;
	}

}
