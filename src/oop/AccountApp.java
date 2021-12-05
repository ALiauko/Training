package oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.setRate();
		la.increaseRate();
		la.setTerm(5);
		la.setAmmortSchedule();
		
		// Polymorphism changes where we are pointing
		IRate account1 = new LoanAccount(); // IRate is a property
		account1.setRate();
		account1.increaseRate();
	}

}
