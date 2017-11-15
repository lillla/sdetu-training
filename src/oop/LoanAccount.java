package oop;

public class LoanAccount implements IRate{
	//Interface methods
	public void setRate() {
		System.out.println("rate");
	}
	public void increaseRate() {
		System.out.println("increase rate");
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the term to " + term + "years");
	}
	public void amort() {
		System.out.println("amoritzation ");
	}
}
