package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		//Create variable to define career
		
		//declare
		String career;
		System.out.println("Program is starting");
		
		//define
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		//declare & define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a "+ career +" is: " + salary);
		
		
		//annual salary
		
	}
}
