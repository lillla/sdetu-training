package Labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("45231856", 4000);
		BankAccount acc2 = new BankAccount("96894564",2000);
		BankAccount acc3 = new BankAccount("95615458",4560);
		
		acc1.setName("James");
		acc1.makeDeposit(550);
		acc1.payBill(800);
		acc1.makeDeposit(620);
		System.out.println(acc1.toString());
	}
}

class BankAccount implements IInterest{
	private String accountNumber;   //id + 2 random digits + ssn first 2 digits
	private static final String routingNumber= "00548436";
	private String name;
	private String ssn;
	private double balance;
	private static int id= 1001;              //internal id, bank's identifier
	
	//Constructor
	BankAccount(String ssn, double initDeposit){
		System.out.println("NEW ACCOUNT CREATED");
		balance= initDeposit + balance;
		this.ssn=ssn;
		id++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random()*100);
		accountNumber = id + "" + random + "" + ssn.substring(0,2);
		System.out.println(accountNumber);
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		System.out.println("Paying a bill of $" + amount);
		balance = balance-amount;
		showBalance();
	}
    public void makeDeposit(double amount) {
    	System.out.println("Making a deposit of $" + amount);
		balance = balance+amount;
		showBalance();
	}
    public void showBalance() {
    	System.out.println("Balance: "+ balance);
    }

    @Override
	public void acrue() {
		balance = balance*(1+ rate/100);
	}
    @Override
    public String toString() {
    	return "[Name: " + name + "]\n" +"[Account Number: " + accountNumber +"]\n" + "[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance +"]";
    }
    
}