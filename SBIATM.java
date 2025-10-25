package abstraction;

public class SBIATM extends ATM {

	@Override
	void withdraw() {
		System.out.println("Withdrawing from SBI ATM..");
	}

	@Override
	void checkbalance() {
		System.out.println("Checking balance from SBI ATM..");
	}

	@Override
	void deposit() {
		System.out.println("Depositing  from SBI ATM..");

	}

}
