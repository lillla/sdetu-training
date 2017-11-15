package Labs;

public class Student {
	private String ssn;
	private String name;
	private static int iD=1000;
	private String email;
	private String userID;
	private double balance=0;
	private String city;
	private String state;
	private String phone;
	private boolean maths=false;
	private boolean music=false;
	private boolean english=false;
	
	
	Student(String name, String ssn){
		this.ssn=ssn;
		this.name=name;
		iD++;
		createEmail();
		setUserID();
	}
	
	private void createEmail() {
		email = name + "@studentmail.com";
	}

	private void setUserID() {
		int random=0;
		while (random<1000 || random>9000) {
			random = (int) (Math.random()*10000);
		}
		userID = iD + "" + random + "" + ssn.substring((ssn.length()-4),ssn.length());
		System.out.println("The user ID of " + this.name + " is: " + userID);
	}
	
	public void enroll( String course) {
		if (course!="Maths" && course!="Music" && course!="English") {
			System.out.println("ERROR no such course exists in system");
		}
		if(course=="Maths") {
			this.maths=true;
		}
		if(course=="English") {
			this.english=true;
		}
		if(course=="Music") {
			this.music=true;
		}
		System.out.println(this.name + " is enrolled in " + course);
	}
	public void pay(double amount) {
		System.out.println("PAY: $"+ amount);
		balance=balance+amount;
	}
	public double checkBalance() {
		return balance;
	}
	public String toString() {
		return "[ Name: "+name+"]\n"+"[ User ID: "+userID+" ]"+"[ Email: "+email+" ]";
	}
	public void showCourses() {
		System.out.print("The courses of "+ this.name + " are: ");
		if (this.english==true) {
			System.out.print("English ");
		}
		if (this.maths==true) {
			System.out.print("Maths ");
		}
		if (this.music==true) {
			System.out.print("Music ");
		}
		System.out.println();
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	public static void main(String[] args) {
		Student student1 = new Student("Jane","5856522355");
		Student student2 = new Student("Joseph","8156954744");
		System.out.println();
		System.out.println(student1);
		System.out.println();
		student1.pay(500);
		System.out.println("Balance of "+student1.name + " is "+ student1.checkBalance());
		System.out.println();
		student2.enroll("Music");
		student2.enroll("Maths");
		student2.showCourses();
		System.out.println();
		student1.setPhone("00658425652");
		System.out.println("The phone number of " + student1.name+ " is: " + student1.getPhone());
		student2.setCity("Los Angeles");
		System.out.println("The city number of " + student2.name+ " is: " + student2.getCity());
		
		
	}

}
