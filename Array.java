package ajay;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no .of arrays: ");
		int size= sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the "+size+" arrays");
		int []a = new int[size];
		
		
		for(int i=0;i<size;i++) {
			a[i] = sc.nextInt();
			
		}
		int large =a[0];
		for(int i=1; i<size;i++) {
			if(a[i]>large) {
				large =a[i];
			}
		}
		System.out.println("The Largest Number is"+large);
		
		sc.close();
	}

}
