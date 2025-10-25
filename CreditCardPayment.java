package abstraction.interfaces;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid INR " +amount+" using Credit Card");
	}

}
