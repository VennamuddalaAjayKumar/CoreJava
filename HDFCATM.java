package abstraction;

public class HDFCATM extends ATM {


	@Override
	void withdraw() {
		System.out.println("Withdrawing from HDFC ATM..");
	};

	@Override
	void checkbalance() {
		System.out.println("Checking balance from HDFC ATM..");
	};

	@Override
	void deposit() {
		System.out.println("Depositing  from HDFC ATM..");

	}

}
