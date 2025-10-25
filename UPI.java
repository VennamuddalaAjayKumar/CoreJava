package abstraction.interfaces;

public class UPI implements PaymentGateway {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("processing UPI payment of INR:"+amount);
	}

}
