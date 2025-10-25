package abstraction;

public class ATMRUNNER {

	public static void main(String[] args) {
		ATM sbiatm = new SBIATM();
		sbiatm.insertCard();
		sbiatm.checkbalance();
		sbiatm.deposit();
		sbiatm.withdraw();
		
		
		ATM hdfcatm = new HDFCATM();
		
		hdfcatm.insertCard();
		hdfcatm.checkbalance();
		hdfcatm.deposit();
		hdfcatm.withdraw();
	}

}
