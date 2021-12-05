package labs;

public class Lab2 {

	public static void main(String[] args) {
		StudentNew st1 = new StudentNew ("Jim", "5542103584");
		StudentNew st2 = new StudentNew ("Thomas", "5481120431");
		st1.enroll("Math");
		st1.enroll("Physics");
		st1.enroll("Astronomy");
		
		st1.showCourses();
		st1.checkBalance();
		st1.pay(600);
		st1.checkBalance();
		System.out.println(st1.toString());
		
	}
}
class StudentNew {
	// Properties
	private static int ID = 0;
	private String UserID;
	private String name;
	private String SSN;
	private String email;
	private String courses = "";
	private static final int costOfCourse = 800;
	private int balance=0;
	private String phone;
	private String city;
	private String state;
	
	public StudentNew (String name, String SSN) {
		ID++;
		this.name = name;
		this.SSN = SSN;
		setUserId();
		setEmail();		
	}
	private void setEmail() {
		email = name.toLowerCase() +"."+ID+ "@email.com";
		System.out.println("Your email: "+ email+".");
	}
	public String getEmail() {
		return email;
	}
	private void setUserId() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random()*((max - min)));
		random = random + min;
		//System.out.println(random);
		UserID = ID + random + SSN.substring(6);
		System.out.println("Your User ID: "+UserID);
	}
	public void enroll(String course) {
		this.courses = this.courses + " " + course;	
		//System.out.println(courses);
		balance = balance + costOfCourse;
	}
	public void pay(int amount) {
		System.out.println("Payment: $"+amount+".");
		balance = balance - amount;
	}
	public void checkBalance() {
		System.out.println("Balance: $" +balance);
	}
	public void showCourses() {
		System.out.println(courses);
		
	}
	public String toString() {
		return "[Name: "+name+"]\n[COURSES: "+courses+"]\n[BALANCE: "+balance+"]";
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getState(){
		return state;
	}
}
