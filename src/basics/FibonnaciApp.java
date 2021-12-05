package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		// Fibonnaci number is defined by the sum of the 2 previous fibonnaci numbers
		// fib(0) = 0;
		// fib(1) = 1; 
		// fib(2) = fib(0) + fib(1) = 0 + 1 = 1;
		// fib(3) = fib(1) + fib(2) = 1 + 1 = 2;
		// fib(4) = fib(3) + fib(2) = 2 + 1 = 3;
		// fib(5) = fib(4) + fib(3) = 3 + 2 = 5;
		//int[] x= {0,1,2,3,4,5};
		for (int x = 0;x < 5;x++) {
			System.out.println("Fibonnaci number is "+fib(x));
		}
		
		// 1! = 1 * 1 = 1
		// 2! = 2 * 1 = 2
		// 3! = 3 * 2 * 1 = 6
		// 4! = 4 * 3 * 2 * 1 = 24
		// 5! = 5 * 4 * 3 * 2 * 1 = 120
		long factor=1;
		for (int y=1;y<10;y++) {
			factor = factor * y;
			System.out.println("Factorial is " + factor);
		}
		for (int z=1;z<10;z++) {
			System.out.println(fact(z));
		}		
	}
	public static int fib(int n) {
		if (n==0) {
			return 0;
		}		
		else if(n==1) {
			return 1;
		}	
		return (fib(n-1)+fib(n-2));
	}
	
	public static int fact(int v) {
		if (v==1) {
			return (v * v);
		}
		else if(v==2) {
			return (v*fact(v-1));
		}
		else if(v==3) {
			return (v*fact(v-1)*fact(v-2));
		}
		return (fact(v-1)*v);
	}
}
