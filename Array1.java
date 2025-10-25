package ajay;
import java.util.Scanner;
public class Array1 {
    public static int[] read() {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("Enter 5 integers");
        for (int i=0;i<numbers.length;i++) {
        	numbers[i]=sc.nextInt();
        }
        return numbers;
    }
    
    public static int sum(int[] a) {
    	int b=0;
    	for(int num:a) {
    		b += num;
    	}
    	return b;
    	
    }
    
    public static void main(String[] args) {
		int []numbers =read();
		int b= sum(numbers);
		System.out.println("The sum of all numbers is: " + b);
    
	}
}