package basics;

public class SalaryCalculator {
	public static void main (String[] args){
		// Let's create a variable to define our career
		// Declare a variable
		// Computer our annual salary
		// rate * hoursPerWeek * weeksPreYear
		String career; 
		System.out.println("Program is starting.");
		career = "Software Developer";
		System.out.println("My career is " + career +".");
		
		// Declare and defined a variable
		int hoursPerWeek = 40;
		int weeksPreYear = 50;
		double rate = 14.83;
		career = "Quality Assurance Engineer";
		double salary = hoursPerWeek * weeksPreYear * rate;
		System.out.println("My salary as a " + career +" at the rate of " +rate+ "$ per hour is " + salary +"$ per year.");
	}
}
