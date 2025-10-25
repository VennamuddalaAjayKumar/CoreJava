package association.combined;

public class Bank {
	private String bankName;
	private Customer customer;
	private Account account;
	public Bank(String bankName, Customer customer, String accountNo) {
		super();
		this.bankName = bankName;
		this.customer = customer;
		this.account = new Account(accountNo, 100000);
	}
	void display() {
		System.out.println("Bank Name: "+this.bankName);
		customer.display();
		System.out.println("Account No: "+this.account.getAcNo());
		System.out.println("Balance: "+this.account.getBalance());
		
	}

}
