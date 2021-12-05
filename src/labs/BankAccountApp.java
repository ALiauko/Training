package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("542100", 1000.50);	
		BankAccount ba2 = new BankAccount("684733", 2000);
		BankAccount ba3 = new BankAccount("710348", 3000);
		
		ba1.SetName("Aliaksandra Liauko");
		ba1.makeDeposit(1500);
		ba1.makeDeposit(600);
		ba1.payBill(1000);
		ba1.accrue();
		System.out.println(ba1.toString());
	}

}

class BankAccount implements IInterest{
	// Properties of bank account
	private static int ID = 1000; // Internal ID, this value will belong to the class
	private String accountNumber; // ID + random 2-digit number + first of SSN
	private static final String routingNumber = "002115880"; // we can't change this number
	private String name;
	private String SSN;
	private double balance;
	// private - encapsulation will insure that class will access to the variables through the methods
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		System.out.println("New Account Created.");
		balance = initDeposit;
		this.SSN=SSN;
		ID++;
		//System.out.println("Account ID is: " +ID+".");
		setAccountNumber();
	}
	private void setAccountNumber() {
		int random = (int) (Math.random()*100);
		this.accountNumber = ID + ""+ random + ""+ SSN.substring(0, 2);
		System.out.println("Your Account Number is: "+accountNumber+".");
	}
	public void SetName(String name) {
		this.name = name;
		System.out.println("Name is: "+name+".");
	}
	public String getName() {
		return name;
	}
	public void payBill (double amount) {
		balance = balance - amount;
		System.out.println("Paying bill is: "+amount+".");
		showBalance();		
	}
	public void makeDeposit (double amount) {
		balance = balance + amount;
		System.out.println("Making deposit is: "+amount+".");
		showBalance();
	}
	public void showBalance() {
		System.out.println("Your balance is: "+balance+".");
	}
	public void accrueInterest() {		
	}
	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + " ]\n[Routing Number: " + routingNumber +" ]\n[Balance: " + balance + " ]";
	}
}
