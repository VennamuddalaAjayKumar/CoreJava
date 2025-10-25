package abstraction.interfaces;

public class PaymentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Payment creditCardPayment = new CreditCardPayment();
		  creditCardPayment.pay(10000);
		  
		  Payment upiPayment = new UpiPayment();
		  upiPayment.pay(5000);
	}

}
