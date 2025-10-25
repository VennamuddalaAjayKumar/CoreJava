package abstraction.interfaces;

public class BankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sbib = new SBIB();
		sbib.welcome();
		sbib.rateofInterest();
		
		Bank hdfc = new HDFC();
		hdfc.welcome();
		hdfc.rateofInterest();

	}

}
