package basics;

public class Cities {

	public static void main(String[] args) {
		String cities[]= {"New york", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		
		String[] states = new String[3];
		states[0]="Washington1";
		states[1]="Washington2";
		states[2]="Washington3";
		System.out.println(states[2]);
		
		String[] countries;
		countries= new String[5];
		countries[0]="UK";
		countries[1]="France";
		countries[2]="Greece";
		countries[3]="Switzerland";
		countries[4]="Japan";
		
		// do loop: goes into loop then tests the condition
		int i=0;
		do {
			System.out.println(countries[i]);
			i+=1;
		} while (i<5);
		
		//while loop: fordítva
		
		//blabla
		//double[] x = new double[];//NEM JÓ
		

	}

}
