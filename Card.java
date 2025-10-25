package abstraction.interfaces;

public class Card implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		System.out.println("processing Card payment of INR:"+amount);
		
	}

}
