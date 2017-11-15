package oop;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	void eat() {
		System.out.println(name + " is eating");
	}
	void sleep() {
		System.out.println(name + " is sleeping");
	}
}


public class Demo {

	public static void main(String[] args) {
//Instanciating an object
		Person person1 = new Person();
		person1.name= "Joe";
		person1.email= "joe@mail.com";
		person1.phone= "065954655694";
		
		person1.eat();
		person1.walk();
		person1.sleep();
		
		
		
		
		
		/*
		
		//Attributes
		String name = "Joe";
		String email = "joe@example.com";
		String number = "05845657";
		
		//Action, activity, behaviour
		System.out.println(name + " is walking");
		System.out.println(name + " is eating");
		
		//Attributes
		String name2 = "Sarah";
		String email2 = "sarah@example.com";
		String number2 = "05847557";
				
		//Action, activity, behaviour
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
	}
		
		//Add functions to minimise code
		
		static void walking (String name) {
			System.out.println(name + " is walking");
		}
		*/
	}
}
