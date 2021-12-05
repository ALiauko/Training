package basics;

public class Quiz2 {
	public static void main (String[] args) {
		int value = 50;
		int temp = 10;
		int average = 25;
		/*if (value > temp) {
		     if (value > average) {
		     String message = "Value greater than average";
		     System.out.println(message);
		     }
		     else if (value < average) {
		     String message = "Value less than average";
		     System.out.println(message);
		     }
		     }*/
		if ((value > temp) && (value > average)) {
			String message = "Value greater that average";
			System.out.println(message);
		}
		else if ((value > temp) && (value < average)){
			String message = "Value less that average";
			System.out.println(message);
		}
	}
}
