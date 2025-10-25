package ajay;

public class Method {
		static int count =0;
		Method(){
			count++;
			System.out.println(count);
		}
		public static void main(String[] args) {
			new Method();
			new Method();
			new Method();
		}
}
