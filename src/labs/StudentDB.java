package labs;

public class StudentDB {

	public static void main(String[] args) {
		Student st1 = new Student("Alex", "Flex", "8881009801");
		st1.setPhone("551240255");
		st1.enroll();
		st1.checkBalance(5000);
		System.out.println(st1.toString());
		System.out.println("-----------------------------------------");
		Student st2 = new Student ("Ron","Brown","8845210314");
		st2.setPhone("554251035");
		st2.enroll();
		st2.checkBalance(2000);
		System.out.println(st2.toString());
	}
}

class Student {
	private String FirstName;
	private String LastName;
	private String SSN;
	private String email; // automatically created email ID based on the name
	private static String ID = "100"; //is combination of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
	private String[] courses = {"Math", "Physics", "Astronomy", "Technical drawing"};
	private int[] coursePrice = {500, 1500, 2500, 3500};
	private double balance;
	private String phone;	
	
	public Student (String FirstName, String LastName, String SSN){
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.SSN = SSN;
		int min = 1000;
		int max = 9000;
		int random = (int) Math.floor(Math.random() * ((max - min)+ min));
		ID = ID + random + SSN.substring(6);
		System.out.println(FirstName +" " + LastName + " is a student with SSN: "+SSN+" and ID: "+ID+".");
		setMail();
	}
	private void setMail() {
		String em="@email.com";
		email = FirstName.substring(0, 1).toLowerCase()+LastName.toLowerCase()+"_"+ID+em;
		System.out.println("Student's email is: "+ email + ".");
	}
	private void showCourses(){
		System.out.println("Available courses: ");
		for (int i=0;i<4;i++) {
			System.out.print("\n- "+courses[i]);
		}				
	}
	private int min = 0;
	private int max = 4;
	private int n = (int) Math.floor(Math.random()*((max-min)+min));
	public void enroll() {
		showCourses();
		System.out.println("\n"+FirstName+" " +LastName+ " have signed up for a '" + courses[n] + "' course. \nNOTIFICATION: Payment must be made before classes start.");
		if (n==0) {
			System.out.println("'"+courses[n]+ "' course costs " +coursePrice[n]+ ".");
		}
		else if (n==1){
			System.out.println("'"+courses[n]+ "' course costs " +coursePrice[n]+ ".");
		}
		else if (n==2){
			System.out.println("'"+courses[n]+ "' course costs " +coursePrice[n]+ ".");
		}
		else if (n==3){
			System.out.println("'"+courses[n]+ "' course costs " +coursePrice[n]+ ".");
		}
	}
	private void pay(double coursePay) {
		balance = balance - coursePay;
		System.out.println("Payment was successful. After payment the student's balance is: "+balance+".");
	}
	public void checkBalance(double initDeposit) {
		balance = initDeposit;
		System.out.println("Studet's balance is: " +initDeposit+".");
		if (initDeposit > coursePrice[n]) {
			pay(coursePrice[n]);
		}
		else {
			System.out.println("WARNING: Insufficient cash in the account. Payment cannot be made.");
		}
	}
	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("Student's phone is: " +phone+".");
	}
	public String getPhone() {
		return phone;
	}
	
	public String toString() {
		return "\n[STUDENT: "+FirstName+" "+LastName+"]\n[SSN: "+SSN+"]\n[EMAIL: "+email+"]\n[PHONE: "+phone+"]\n[COURSE: "+courses[n]+"]\n[BALANCE: "+ balance + "]";
	}
}
