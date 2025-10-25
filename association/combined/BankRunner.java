package association.combined;

public class BankRunner {

	public static void main(String[] args) {
		Customer customer = new Customer("Ajay");
		Bank bank = new Bank("SBI", customer, "2565258");
		bank.display();
	}

}
