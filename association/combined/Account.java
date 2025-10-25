package association.combined;

public class Account {
	private String acNo;
	private double balance;
	public Account(String acNo, double balance) {
		super();
		this.acNo = acNo;
		this.balance = balance;
	}
	public String getAcNo() {
		return acNo;
	}
	public void setAcNo(String acNo) {
		this.acNo = acNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
