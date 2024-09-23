
public class MarriageDecoration {
	public static void main(String[] args) {
	
		//what if i want to deply such 5 marriage ceremonies in a stadium?
		
		EventManager event = new EventManager();
		
		//below 4 threads are ready to do their work,
		//but they are controlled by the common object of EventManager, ie event
		StageBuilder stageDecor = new StageBuilder(event);
		CurtainDecorator curtainDecor = new CurtainDecorator(event);
		FlowerDecorator flowerDecor = new FlowerDecorator(event);
		LightingDecorator lightDecor = new LightingDecorator(event);
		
		stageDecor.start();  //1

		curtainDecor.start(); //4

		flowerDecor.start(); //2
		lightDecor.start(); //3
		
		
		
		
		
	}
}

class EventManager
{
	private boolean stageBuiltUp=false;
	private boolean curtainDeployed=false;
	private boolean flowerDecorated=false;
	private boolean lightsDecorated=false;
	
	public boolean isStageBuiltUp() {
		return stageBuiltUp;
	}
	public void setStageBuiltUp(boolean stageBuiltUp) {
		this.stageBuiltUp = stageBuiltUp;
	}
	public boolean isCurtainDeployed() {
		return curtainDeployed;
	}
	public void setCurtainDeployed(boolean curtainDeployed) {
		this.curtainDeployed = curtainDeployed;
	}
	public boolean isFlowerDecorated() {
		return flowerDecorated;
	}
	public void setFlowerDecorated(boolean flowerDecorated) {
		this.flowerDecorated = flowerDecorated;
	}
	public boolean isLightsDecorated() {
		return lightsDecorated;
	}
	public void setLightsDecorated(boolean lightsDecorated) {
		this.lightsDecorated = lightsDecorated;
	}
	
	//it allows one thread to enter into the method
	synchronized void makeStage() {
		if(isStageBuiltUp()==false) {
			System.out.println("1 EVENT:MAKING THE STAGE...");
			setStageBuiltUp(true);
			notify(); //awakens the waiting thread over this object
		}
		/*else {
			System.out.println("1 EVENT:STAGE NOT BUILT UP....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
	}
	
	synchronized void deployCurtains() {
		if(isStageBuiltUp()==true && isCurtainDeployed()==false) {
			System.out.println("2 EVENT:DEPLOYING THE CURTAIN...");
			setCurtainDeployed(true);
			notify();

		}
		else {
			System.out.println("2 EVENT:CURTAIN NOT DEPLOYED...");
			try {
				wait(); //it waits for the other thread to run
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	synchronized void designFlowers() {
		if(isStageBuiltUp() == true && isCurtainDeployed()==true && isFlowerDecorated()==false) {
			System.out.println("3 EVENT:DESIGNING THE FLOWERS...");
			setFlowerDecorated(true);
			notify();
		}
		else {
			System.out.println("3 EVENT:FLOWERS...NOT DECORATED");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}
	
	synchronized void decorWithLights() {
		if(isStageBuiltUp()==true && isCurtainDeployed()==true && isFlowerDecorated()==true && isLightsDecorated()==false) {
			System.out.println("4 EVENT:DECORATING LIGHTS.....");
			setLightsDecorated(true);
			notify();

		}
		else {
			System.out.println("4 EVENT:LIGHTS NOT DECORATED....");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}
/*
 * 		Teller1 t1 = new Teller(bankObj);
 * 		Teller1 t2 = new Teller(bankObj);
 * 		Teller1 t3 = new Teller(bankObj);
 * 
 * 		t1.start(); --> run() -> bankObj.deposit();
 * 		t2.start(); --> run() -> bankObj.deposit();
 * 		t3.start(); --> run() -> bankObj.deposit();
 * 
 * 
 * 
 */
class StageBuilder extends Thread
{
	
	EventManager eventRef;
	
	
	public StageBuilder(EventManager eventRef) {
		super();
		this.eventRef = eventRef;
	}

	public void run() {
		eventRef.makeStage();
		//buildTheStage();
	}
	
	private void ensureSaftety() {
		System.out.println("1 Ensuring the saftey of the stage....");
	}
	void buildTheStage()
	{		
			System.out.println("1 StageBuilder started....");
			for(int i=0;i<10;i++)
				System.out.println("1 Buidling the Stage....");
			ensureSaftety();
			System.out.println("1 StageBuilder done....");	
	}
}

class CurtainDecorator  extends Thread
{
	

	EventManager eventRef;
	
	
	
	public CurtainDecorator(EventManager eventRef) {
		super();
		this.eventRef = eventRef;
	}
	
	public void run() {
		eventRef.deployCurtains();
		//alignTheCurtains();
	}
	
	private void designFold() {
		System.out.println("\t2 Floding the curtain in a designer way...");
	}
	
	void alignTheCurtains()
	{
		System.out.println("\t2 Curtain Decoration started....");
		designFold();
		for(int i=0;i<10;i++)
			System.out.println("\t\t2 Decorating the curtains...over the stage....");
		System.out.println("\t2 Curtain Decoration over......");

	}
}

class FlowerDecorator  extends Thread
{
	

	EventManager eventRef;
	
	
	
	public FlowerDecorator(EventManager eventRef) {
		super();
		this.eventRef = eventRef;
	}
	
	public void run() {
		eventRef.designFlowers();
		//decorateTheFlowers();
	}
	
	private void makeGarlands() {
		System.out.println("\t\t3 Flower garlands made.....");
	}

	void decorateTheFlowers()
	{
		System.out.println("\t\t3 Flower Decoration started....");
		makeGarlands();
		for(int i=0;i<10;i++)
			System.out.println("\t\t\t3 Decorating the flower....over the curtain...");
		System.out.println("\t\t3 Flower Decoration over....");

	}
}
class LightingDecorator  extends Thread
{
	

	EventManager eventRef;
	
	
	
	public LightingDecorator(EventManager eventRef) {
		super();
		this.eventRef = eventRef;
	}
	
	public void run() {
		eventRef.decorWithLights();
		//installTheLightings();
	}
	
	private void powerOn() {
		System.out.println("\t\t\t4 Power is ON for lighting...");
	}
	public void powerOff() {
		System.out.println("\t\t\t4 Power is OFF for lighting...");
	}
	
	void installTheLightings()
	{
		System.out.println("\t\t\t4 Light Decoration started....");
		powerOn();
		for(int i=0;i<10;i++)
			System.out.println("\t\t\t\t4 Decorating the light efffects....over the flower...");
		System.out.println("\t\t\t4 Light Decoration over....");

	}
}
