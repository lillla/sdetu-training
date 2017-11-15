package basics;

public class Weather {
	public static void main(String[] args) {
		// gives advice on what to wear
		
		int temperature = 40;
		String conditions = "Sunny";
		
		if (temperature >80) {
			System.out.println("t-shirt!");
		}
		else if (temperature>60) {
			System.out.println("long sleeves");
		}
		else if (conditions=="Sunny") {
			System.out.println("its sunny but cold");
		}
		else {
			System.out.println("sweather");
		}
	}
}
