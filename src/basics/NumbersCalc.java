package basics;

public class NumbersCalc {
	
	static void printName() {
		System.out.println("my name is Lilla");
		
		
	}
	
	static int addNumbers(int numberA, int numberB){
		int sum = numberA+numberB;
		return sum;
	}
	
	static int multiplyNumber(int valueA, int valueB){
		int product;
		product=valueA*valueB;
		return product;
	}
	
	public static void main(String[] args) {
		printName();
		
		int numA= 10;
		int numB= 5;
		System.out.println("The two numbers are: " + numA + " and " + numB);
		System.out.println("the sum is: " + addNumbers(numA,numB));
		System.out.println("the product is: " + multiplyNumber(numA,numB));
	}

}
