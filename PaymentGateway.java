package abstraction.interfaces;

public interface PaymentGateway {
		void processPayment(double amount);
		
		default void generateReciept(double amount){
		log("Generating Reciept");
			System.out.println("Thanks for shopping withus ,total amount is: "+amount);
			\/00
			
		}
		static boolean validatePaymentId(String id) {
		log("Validating Payment Id....");
		return id!=null && id.startsWith("PAY") && id.length()>5;
		}
		private static void log(String msg) {
			System.out.println("[payment Log]"+msg);
		}
}
