package ajay;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the digits:");
		int  n =sc.nextInt();
		
		int n1 =0,n2 =1,next;
		System.out.println("Fibonacci series up to "+n+"terms");
		
		for(int i=1;i<=n; i++) {
			System.out.println(n1+" ");
			
			next = n1+n2;
			n1 = n2;
			n2 =next;
			
		}
		System.out.println();
	}
}
