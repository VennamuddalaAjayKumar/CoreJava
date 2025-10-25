package abstraction.interfaces;

public class UpiPayment implements Payment {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid INR " +amount+" using UPI ");
	}

}
