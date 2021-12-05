package oop;

class Person {
	String name;
	String email;
	String phone;
	void walk(){
		System.out.println(name + " is walking.");
	}
	void eat(){
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is sleeping.");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		Person person1 = new Person();
		
		// Define some properties
		person1.name = "Joe";
		person1.email = "joe@email.com";
		person1.phone = "5546732";
		
		// Abstraction
		person1.walk();
		person1.eat();
		person1.sleep();
		
		Person person2 = new Person();
		person2.name = "Sasha";
		person2.sleep();
		
		/*// Person
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@email.com";
		String phone = "445120021558";
		
		// Action, activity, behaivor
		//System.out.println(name + " is walking.");
		walking(name);
		
		// What if we want to do this for another person
		String name1 = "Sarah";
		String email1 = "sarah@email.com";
		String phone1 = "5548210";
		
		// Action, activity, behaivor
		//System.out.println(name1 + " is walking.");
		walking(name1);
		
		// What about binding attributes and properties together?
	}
	// Enhance by adding functions to minimize code
	static void walking (String name) {
		System.out.println(name + " is walking.");*/
	}
}

