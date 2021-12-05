package oop;

public class BankAccount implements IRate{
	// Define variables
	String accountNumber;
	// static >> this value belongs to the CLASS not to particular object instance
	// final >> constant (often static and final go together)
	private static final String routingNumber = "551240"; 
	
	// Instance Variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Between variables and methods we have constructor definitions - unique methods:
	// 1. They are used to define / setup / initialize properties of an object 
	// 2. Constructors are IMPLICITLY called upon INSTANTIATION
	// 3. The same name as the class itself
	// 4. Constructors have no returned type
	
	BankAccount(){ // Constructor
		System.out.println("NEW ACCOUNT CREATED.");
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType){ // Constructor with an argument
		System.out.println("NEW ACCOUNT: " + accountType);
	}	
	BankAccount (String accountType, double initDeposit){
		// initDeposit, msg, accountType - are local variables (defined within block/method/loop)
		System.out.println("INITIAL DEPOSIT OF " +accountType+ " is $"+initDeposit+".");
		String msg = null;
		if (initDeposit < 1000) {
			msg = "ERROR: Minimum deposit must be at least $1,000.";
		}
		else {
			msg = "Thanks for your initial deposit of: $"+initDeposit;
		}
		System.out.println(msg);
		balance = balance + initDeposit;
	}
	
	// Getters / Setters
	// Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	public String getName() {
		return name;
	}	
	public void setSsn (String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSITE");
	}
	void withDraw(double amount) {
		balance = balance + amount;	
		showActivity("WITHDRAW");
	}
	
	// Private: can only be called within the class
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: "+activity+".");
		System.out.println("Your balance is: $" +balance+".");
	}
	
	void checkBalance() {
		System.out.println("Balance is: "+balance);
		
	}
	void getStatus() {
		
	}
	
	@Override
	public String toString () {
		return "[ NAME: " + name + ". ACCOUNT#: " + accountNumber + ". ROUTING#: " + routingNumber + ". BALANCE: $" + balance +" ]";
	}
}
