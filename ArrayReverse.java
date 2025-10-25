package ajay;
import java.util.Scanner;
public class ArrayReverse {
	public static int[] num() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no .of integers:");
		int size = sc.nextInt();
		
		int []a = new int[size];
		System.out.println("Enter "+(size+1)+"Integers:");
		for(int i=0; i<size;i++) {
			a[i] =sc.nextInt();
		}
		return a;
	}
	
	public static void reverse(int a[]) {
		System.out.println("Array in reverse order:");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i] +" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] numbers =num();
		reverse(numbers);
	}
}

