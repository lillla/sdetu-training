package oop;

public class BankAcount implements IRate{
	//Define variables
	String accountNumber;
	
	//this one can't be changed later, and belongs to class
	static final String routingNumber= "65842";
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	//Constructore definitions
	// define/setup/initialize properties
	// they are called upon instantiation
	// the same name as class
	// they have no return type
	
	BankAcount(){
		System.out.println("New Account created!");
		
	}
	
	//Overloading
	BankAcount(String accountType){
		System.out.println("New Account: " + accountType + " created!");
	}
	
	BankAcount(String accountType, double initDeposit){
		System.out.println("New Account: " + accountType + " created!");
		System.out.println("Initial Deposit: " + initDeposit );
		String msg = null;
		if (initDeposit<1000) {
			msg="Error: deposit have to be at least 1000.";
		}
		else {
			msg="Thank you for your deposit";
		}
		System.out.println(msg);
		balance= balance + initDeposit;
	}
	
	//Getters and setters
	
	//Allow the user to define the name
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	
	
	//Interface methods
	 public void setRate() {
		 System.out.println("SETTING RATE");
	 }
	 public void increaseRate() {
		 System.out.println("INCREASING RATE");
	 }

	//Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance + amount;
		showActivity("WITHDRAW");
	}
	
	//private: available only in this class
	private void showActivity( String activity) {
		System.out.println("Recent activity: " + activity);
		System.out.println("Your new balance is: " + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	void getStatus() {
		
		
	}
	
	@Override
	public String toString() {
		return ("[ "  + name + ". " + accountNumber + ".BALANCE: $" + balance + "]");
	}

}
