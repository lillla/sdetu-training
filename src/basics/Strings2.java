package basics;

public class Strings2 {

	public static void main(String[] args) {
		String bookTitle;
		bookTitle = "Harry Potter";
		if(bookTitle.equalsIgnoreCase("harry potter")) {
			System.out.println("they are equal");
		}
		
		String lastName = "Nagy";
		String firstName = "Aladár";
		
		System.out.print(lastName.substring(0, 1));
		System.out.println(firstName.substring(0, 1));
		System.out.println(firstName.substring(4));
	}

}
