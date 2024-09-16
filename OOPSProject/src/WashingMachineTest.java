
public class WashingMachineTest {
	public static void main(String[] args) {
		
		//below 4 objects are passed as an argument 
		//they are not the hasA member of any WashingMachine
		Detergent detergent = new Detergent("Arial", "TopLoad", "Powder", 2, 20);
		Water water = new Water("SoftWater", 30, "Normal Temperature");
		Electricity elect = new Electricity("Reliance", 220.0f, 15, 2);		
		
		Cloth cloth1 = new Cloth("Shirt", "White","Linen", true, 3000);
		Cloth cloth2 = new Cloth("Jean", "Blue","Cotton", true, 4000);
		Cloth cloth3 = new Cloth("T-Shirt", "Greeen","Cotton", true, 1500);
		Cloth cloth4 = new Cloth("Kurta", "Gold","Satin", true, 1000);
		Cloth cloth5 = new Cloth("Vest", "White","Cotton", true, 200);
		
		Cloth clothes[]=new Cloth[5];
		clothes[0]= cloth1;
		clothes[1]= cloth2;
		clothes[2]= cloth3;
		clothes[3]= cloth4;
		clothes[4]= cloth5;
		
		//following machine hasA WashingTub inside it - mandatory part of it
		WashingMachine samsungMachine = new WashingMachine();
		
		
		samsungMachine.wash(detergent, water, elect, clothes);
		
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




class Detergent
{
	private String brand; //Arial, Tide, etc
	private String forWhichMachine; //top/front
	private String detergentType; //liquid, powder
	private float quantity; //2 
	private float amount; //10
	
	public Detergent(String brand, String forWhichMachine, String detergentType, float quantity, float amount) {
		super();
		this.brand = brand;
		this.forWhichMachine = forWhichMachine;
		this.detergentType = detergentType;
		this.quantity = quantity;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Detergent [brand=" + brand + ", forWhichMachine=" + forWhichMachine + ", detergentType=" + detergentType
				+ ", quantity=" + quantity + ", amount=" + amount + "]";
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getForWhichMachine() {
		return forWhichMachine;
	}
	public void setForWhichMachine(String forWhichMachine) {
		this.forWhichMachine = forWhichMachine;
	}
	public String getDetergentType() {
		return detergentType;
	}
	public void setDetergentType(String detergentType) {
		this.detergentType = detergentType;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	
	
}

class Water
{
	private String type ;//hard/soft
	private int quantity;
	private String temperatureValue;
	public Water(String type, int quantity, String temperatureValue) {
		super();
		this.type = type;
		this.quantity = quantity;
		this.temperatureValue = temperatureValue;
	}
	@Override
	public String toString() {
		return "Water [type=" + type + ", quantity=" + quantity + ", temperatureValue=" + temperatureValue + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTemperatureValue() {
		return temperatureValue;
	}
	public void setTemperatureValue(String temperatureValue) {
		this.temperatureValue = temperatureValue;
	}
	
	
	
	
}
class Cloth
{
	String clothType; //shirt/jean/pant/kurta/
	String clothColor;
	String clothMaterial; //satin,cotton,linen
	
	boolean dirty=true; //default is yes
	float cost;
	
	public Cloth(String clothType, String clothColor, String cm, boolean dirty, float cost) {
		super();
		this.clothType = clothType;
		this.clothColor = clothColor;
		clothMaterial = cm;
		this.dirty = dirty;
		this.cost = cost;
	}

	
	
	
	public String getClothMaterial() {
		return clothMaterial;
	}




	public void setClothMaterial(String clothMaterial) {
		this.clothMaterial = clothMaterial;
	}




	@Override
	public String toString() {
		return "Cloth [clothType=" + clothType + ", clothColor=" + clothColor + ", dirty=" + dirty + ", cost=" + cost
				+ "]";
	}

	public String getClothType() {
		return clothType;
	}

	public void setClothType(String clothType) {
		this.clothType = clothType;
	}

	public String getClothColor() {
		return clothColor;
	}

	public void setClothColor(String clothColor) {
		this.clothColor = clothColor;
	}

	public boolean isDirty() {
		return dirty;
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
	
	
}
class Electricity
{
	private String vendor;
	private float voltage;
	private float costPerUnit;
	private float unitConsumed;
	
	public Electricity(String vendor, float voltage, float costPerUnit, float unitConsumed) {
		super();
		this.vendor = vendor;
		this.voltage = voltage;
		this.costPerUnit = costPerUnit;
		this.unitConsumed = unitConsumed;
	}
	@Override
	public String toString() {
		return "Electricity [vendor=" + vendor + ", voltage=" + voltage + ", costPerUnit=" + costPerUnit
				+ ", unitConsumed=" + unitConsumed + "]";
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public float getVoltage() {
		return voltage;
	}
	public void setVoltage(float voltage) {
		this.voltage = voltage;
	}
	public float getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(float costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	public float getUnitConsumed() {
		return unitConsumed;
	}
	public void setUnitConsumed(float unitConsumed) {
		this.unitConsumed = unitConsumed;
	}
	
	
	
}



class WashingMachine extends Machine //isA
{
	//hasA
	private WashingTub theTub = new WashingTub();
	
	
	
				//usesA		usesA		usesA
	void wash(Detergent x, Water y, Electricity z, Cloth c[] ) {
		for(int i=0;i<c.length;i++) {
			System.out.println("> Washing machine is washing..."+c[i].getClothColor()+" color "+c[i].getClothMaterial()+" "+c[i].getClothType()+" of cost "+c[i].getCost()+" Rs.");
		}
		System.out.println("> It is using detergent of "+x.getBrand() + " QTY "+x.getQuantity());
		System.out.println("> Water type is "+y.getType()+ " of temp "+y.getTemperatureValue());
		System.out.println("> Using electricity from : "+z.getVendor()+ " of voltage : "+z.getVoltage());
		theTub.spin();
	}
}






