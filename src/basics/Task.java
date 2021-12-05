package basics;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] array;
		array=new int[6];
		array[0]=2;
		array[1]=43;
		array[2]=54;
		array[3]=15;
		array[4]=-34;
		array[5]=05;*/
		int [] array= {45,-3,77,16,-11,50,27,4,33};
		System.out.print("Array includes the following values: ");
		for (int e=0;e<array.length;e++) {
			System.out.print(array[e]+" ");
		}
		max(array);
		min(array);
		average(array);
		sum(6);
		int v=6;
		System.out.println("Factorial of "+v+" is "+fact(v)+".");
		System.out.println("Array elements sum is "+ss(array)+".");
	}
	static void max (int[] mm) {
		int max=mm[0];
		for(int i=1;i<mm.length;i++) {
			if(max < mm[i]) {
				max = mm[i];
			}
		}
		System.out.println("\n1. Maxim array value is "+max+".");
	}
	static void min (int[] mn) {
		int min = mn[0];
		for(int i=1;i<mn.length;i++) {
			if(min>mn[i]) {
				min=mn[i];
			}
		}
		System.out.println("2. Minimum array value is "+min+".");
	}
	static void average (int[] av) {
		int sum=0;
		for(int i=0;i<av.length;i++) {
			sum=sum+av[i];
		}
		System.out.println("Array elements sum is "+sum+".");
		System.out.println("The numer of array elements is "+av.length+".");
		int ave=sum/av.length;
		System.out.println("3. Average value is "+ave+".");
	}
	public static int ss (int[] r) {
		int s=0;
		for (int i=0;i<r.length;i++) {
			s=s+r[i];
		}
		return s;
	}
	static void sum(int n) {
		int s=1+n;
		System.out.println("Sum of numbers 1 and "+n+" is "+s+".");
	}
	public static int fact (int f) {
		if(f==0) {
			return 1;
		}
		else if(f==1) {
			return (f*f);
		}
		else if(f==2) {
			return (f*(f-1));
		}
		else if (f==3) {
			return (f*(f-1)*(f-2));
		}
		return fact(f-1)*f;
	}
}
