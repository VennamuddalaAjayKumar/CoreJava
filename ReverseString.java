package ajay;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "Ajay";
		char[] vowels = n.toCharArray();
		String revName = "";
		for(int i=vowels.length-1;i>=0;i--) {
			revName =revName+vowels[i];
		}
		System.out.println(revName);
	}

}
