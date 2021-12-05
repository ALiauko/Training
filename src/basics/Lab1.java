package basics;

public class Lab1 {
	public static void main(String[] args) {
		// Write a function that takes a value N and returns the sum of 1 to n
		System.out.println(sum(7)); 
		
		// Write a function that computes factorial *hint: use recursion, n= n*(n-1)!=n*(n-1)*(n-2)!=n*(n-1)*(n-2)*(n-3)...
		int f = 5;
		System.out.println("Factorial of "+f+" is "+fact(f));
		
		// Write 3 functions that return the min, max and avg of an array
		int[] numbers = {5,-8,45,1,-20,55,47};
		System.out.println("Minimum value is "+findMin(numbers));
		System.out.println("Maximum value is "+findMax(numbers));
		System.out.println("Average value is "+findAver(numbers));
	}
	public static int sum (int n) {
		int sum = 0;
		for (int i=1;i<=n;i++) {
			System.out.print(sum+ " + "+i);
			sum = sum + i;	
			System.out.println(" = "+sum);
		}
		return sum;
	}
	public static int fact (int n) {
		if (n ==0) {
			return 1;
		}
		System.out.println(n);
		return (fact(n-1)*n);
	}
	public static int findMin (int[] arr) {
		int min = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	public static int findMax (int[] arr) {
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
	public static int findAver (int[] arr) {
		// Take sum, divide by number of elements
		int sum =0;
		for (int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum: "+sum);
		System.out.println("Number of elements: "+arr.length);
		return sum/arr.length;
	}
}
