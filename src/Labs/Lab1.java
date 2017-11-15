package Labs;

public class Lab1 {

	public static void main(String[] args) {
		int[] x = {8,2,2};
		
		System.out.println(sumOfNumbers(10));
		System.out.println(productOfNumbers(5));
		System.out.println(findMin(x));
		System.out.println(findMax(x));
		System.out.println(findAverage(x));

	}
	
	public static int sumOfNumbers(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static int productOfNumbers(int n) {
		if (n==0) {
			return 1;
		}
		else {
			return (n*productOfNumbers(n-1));
		}
	}
	
	
	public static int findMin (int[] numberArray) {
		int min = numberArray[0];
		for (int i=1; i<numberArray.length; i++) {
			if(numberArray[i]<min) {
				min=numberArray[i];
			}
		}
		return min;
	}
	
	public static int findMax (int[] numberArray) {
		int max = numberArray[0];
		for (int i=1; i<numberArray.length; i++) {
			if(numberArray[i]>max) {
				max=numberArray[i];
			}
		}
		return max;
	}
	
	public static int findAverage (int[] numberArray) {
		int sum = 0;
		int l=numberArray.length;
		for (int i=0; i<l; i++) {
			sum += numberArray[i];
			System.out.println("av " + sum);
		}
		return sum/l;
	}

}
