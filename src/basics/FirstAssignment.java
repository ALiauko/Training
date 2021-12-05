package basics;

public class FirstAssignment {

	public static void main(String[] args) {
		sum(5);
		int v = 5;
		System.out.println("2. Factorial of "+v+ " is " +fact(v)+".");
		System.out.println("-------------------------------------------------------");
		int[] array= {12,62,20,8,2,45,57};
		ave(array);
		min(array);
		max(array);
	}
	static void sum(int n) {
		int sum = 1+n;
		System.out.println("1. The sum of numbers 1 and "+n+" is equal to "+sum+".");
	}
	
	// 1! = 1 * 1 = 1
	// 2! = 2 * 1 = 2
	// 3! = 3 * 2 * 1 = 6
	// 4! = 4 * 3 * 2 * 1 = 24
	// 5! = 5 * 4 * 3 * 2 * 1 = 120
	public static int fact(int f) {
		if(f==0) {
			return 1;
		}
		else if (f==1) {
			return (f*f);
		}
		else if(f==2) {
			return (f*(f-1));
		}
		else if(f==3) {
			return (f*(f-1)*(f-2));
		}
		else if(f==4) {
			return (f*(f-1)*(f-2)*(f-3));
		}
		return fact(f-1)*f;
	}
	
	static void min (int[] mn) {
		int min = mn[0];
		for (int i=1;i<mn.length;i++) {
			if (mn[i] < min) {
				min = mn[i];
			}
		}
		System.out.println("5. Minimum array value is "+min);
	}
	
	static void max (int[] mm) {
		int max =mm[0];
		for (int i=1;i<mm.length;i++) {
			if(mm[i]>max) {
				max=mm[i];
			}
		}
		System.out.println("6. Maximum array value is " +max);
	}
	static void ave (int[] av) {
		int sum=0;
		for(int i=0;i<7;i++) {
			sum=sum+av[i];
		}
		System.out.print("Array includes the following numbers: ");
		for(int e =0;e<av.length;e++) {
			System.out.print(av[e]+" ");
		}
		double aver=sum/av.length;
		System.out.println("\n3. The sum of array values is "+sum+". Number of elements in the array is "+av.length+".");
		System.out.println("4. The average of array values is "+aver+".");
	}
}