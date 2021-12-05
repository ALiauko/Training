package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		BankAccount acc1 = new BankAccount(); // object
		// acc1.name = "Roger Hue";
		// With Encapsulation: public API methods 
		acc1.setName("Roger Jecson");
		System.out.println(acc1.getName());
		
		acc1.setSsn("554201");
		System.out.println("SSN is: "+ acc1.getSsn()+".");
		
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.accountNumber = "N4510024578";
		acc1.balance = 5500;
		acc1.deposit(1000);
		acc1.deposit(2500);
		acc1.withDraw(4500);
		
		// Polymorphism though overriding
		System.out.println(acc1.toString());
		
		// Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "N5430021864";
		
		BankAccount acc3 = new BankAccount("Person's Account",1500);
		acc3.accountNumber = "N6657301247";
		acc3.checkBalance();
		
		/*System.out.println(acc1.routingNumber);
		System.out.println(acc2.routingNumber);
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 12500;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		cd1.accountNumber = "N7726302";
		cd1.interestRate = "5.5";
		System.out.println(cd1.toString());
		cd1.compount();*/
	}

}
