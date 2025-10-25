package ajay;

public class Boolean {

	public static boolean isEven(int n) {
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int number=8;
		if(isEven(number)){
			System.out.println(number+ "is even");
		}else {
			System.out.println(number+ "is odd");
		}
	}
}


