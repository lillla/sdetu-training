package oop;

public class BankAccountApp{

	
	public static void main(String[] args) {
		//creating a bank account (:instantiate an object)
		BankAcount acc1 = new BankAcount("CheckingAccount",5200.00);
		/*
		BankAcount acc2 = new BankAcount();
		BankAcount acc3 = new BankAcount("SavingsAccount");
		*/
		
		//Encapsulation: public APIs, hiding things
		acc1.setName("Roger");
		acc1.setSsn("54056460");
		acc1.accountNumber="056546454";
		
		System.out.println(acc1.getName());
		System.out.println("SSN: " + acc1.getSsn());
		
		System.out.println(acc1.toString());
	
	
		//demo for inheritance
	
		//alternat?? constructors do not work
		//CDAccount cd = new CDAccount("CD Account", 1000.00);
		/*CDAccount cd1 = new CDAccount(); //csak a default constructor
		cd1.name = "Juan";
		cd1.balance = 1000.00;
		cd1.accountType = "CD Account";
		cd1.accountNumber = "0252336";
		cd1.interestRate = "0.5";
		System.out.println(cd1.toString());*/
		
		System.out.println();
		acc1.deposit(10000);
		acc1.deposit(1000);
		acc1.deposit(5000);
		acc1.withdraw(468);
	
	
	}
}
