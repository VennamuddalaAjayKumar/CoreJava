package abstraction.interfaces;

public class PaymentGateWayRunner1 {
	public static void main(String[] args) {
		UPI upi = new UPI();
		upi.processPayment(10000);
		upi.generateReciept(10000);
		Card card = new Card();
		card.processPayment(10000);
		card.generateReciept(10000);
		
		System.out.println("Is Valid ID?" +PaymentGateway.validatePaymentId("PAY1234"));
		
	}
}
  