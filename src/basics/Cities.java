package basics;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and defined an array
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		System.out.println(cities[0]);
		System.out.println(cities[3]);
		
		// Declare array
		String[] countries;
		//Define the array
		countries = new String[3];
		countries[0] = "US";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[2]);
		
		System.out.println("--------------------------------------------");
		
		// Declare and define the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		// Do loop: enters the loop then tests condition
		do {
			System.out.println("State is "+ states[i]+ ".");
			i = i + 1; // index
		}
		while (i < 5);
		
		System.out.println("--------------------------------------------");
		
		// While tests condition first and then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("State found!");
				stateFound = true;
			}
			n++;			
		}	
		
		// For loop: best structure for iterating through an array
		System.out.println("\nPRINTING WITH FOR LOOP");
		for (int x = 0; x < 5; x++) {
			System.out.println(states[x]);
		}
	}
}
