
public class TellerTest {
	public static void main(String[] args) {
		
		System.out.println("\nBEGIN main \n");
		BankAccount bankAccObj = new BankAccount(101, "Jack", 50000); //ONE OBJECT
				
		System.out.println("BEFORE THREAD : bankObj : "+bankAccObj);
		
		Transaction teller1 = new Transaction("Seeta",bankAccObj,5000); //used by thread1
		Transaction teller2 = new Transaction("\tGeeta",bankAccObj,7000); //used by thread2
		Transaction teller3 = new Transaction("\t\tReeta",bankAccObj,8000); //used by thread3
		

		System.out.println("SEETA CREATING IDLI...");
		teller1.start(); // run() --> deposit(); // idli
		
		System.out.println("GEETA CREATING SAMBAR...");

		teller2.start();// run() --> deposit();  // sambar
		
		System.out.println("REETA CREATING CHUTNEY...");

		teller3.start();// run() --> deposit();  // chutney

		try {
			teller1.join(); //WAIT FOR THIS THREAD TO DIE
			teller2.join();
			teller3.join();
			System.out.println("\n\nWAITING FOR ALL THE 3 THREADS TO GET OVER...ONLY THEN BELOW LINE WOULD RUN...");

		}
		catch(InterruptedException e) {
			System.out.println("Error "+e);
		}

		
		System.out.println("SERVING IDLI+SAMBAR+CHUTNEY FINAL : bankObj : "+bankAccObj); // i want to serve the idli+sambar+chutney

		System.out.println("\nEND main\n");
		
	}
}

class Transaction extends Thread
{
	BankAccount bankRef;
	String tellerName;
	double amountToDeposit;
	
	public Transaction(String tellerName, BankAccount bankRef,double amount) {
		super();
		this.tellerName = tellerName;
		this.bankRef = bankRef;
		amountToDeposit = amount;
	}
	
	public void run() {
		bankRef.deposit(tellerName, amountToDeposit);
	}
	
}

class BankAccount
{
	int acno;
	String accountHolder;
	double balance;
	
	
	
	@Override
	public String toString() {
		return "BankAccount [acno=" + acno + ", accountHolder=" + accountHolder + ", balance=" + balance + "]";
	}

	public BankAccount(int acno, String accountHolder, double balance) {
		super();
		this.acno = acno;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	//it allows only ONE single thread to enter into this method, 
	synchronized void deposit(String whoIs, double amountToDeposit) {
		System.out.println(whoIs+" invoked deposit method ");
			double currentBalance = getBalance();
		System.out.println(whoIs+" got the balance : "+currentBalance);
			double newBalance = currentBalance + amountToDeposit;
		System.out.println(whoIs+ " calculated the amount");
		System.out.println(whoIs+" setting the new balance : "+newBalance);
			setBalance(newBalance);

	}
	
	
	
}
