package ajay;
import java.util.Scanner;
public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String n = sc.nextLine();
		
		String rev =" ";
		
		for(int i = n.length()-1;i>=0;i--) {
			rev +=n.charAt(i) ;
			
		}
		System.out.println("Reverse String:"+rev);
	}

}
