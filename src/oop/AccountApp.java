package oop;

public class AccountApp {
	// LoanAccount implements the IRate interface
	public static void main(String[] args) {
		
		//all methids of LoanAccount
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.amort();
		la.setTerm(5);
		
		//only methods in the interface IRate
		//POLYMORPHISM because changes where we are pointing
		//creating based on IRATE but will point to LoanAccount
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
		
	}

}
