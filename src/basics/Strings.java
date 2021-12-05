package basics;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice +".");
		}
		
		String browser = "Chrome";
		// if (browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome.");
		}
		
		String firstName = "Sasha";
		String lastName = "Liuako";
		String ssn = "1564555";
		
		System.out.println("There are " +ssn.length() + " digits in your ssn.");
		
		// Print the initials plus the last 4 digits of ssn
		System.out.println(firstName.substring(0,1)+". "+lastName.substring(0, 1)+". "+ssn.substring(3,7));
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(ssn.substring(3));
		
	}

}
