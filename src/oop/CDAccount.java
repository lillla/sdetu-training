package oop;

public class CDAccount extends BankAcount implements IRate {

	String interestRate;
	
	void compount() {
		System.out.println("Compounding interest");
	}

}
