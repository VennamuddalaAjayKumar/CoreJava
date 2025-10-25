package inheritance;

public class HomeLoan extends BankLoan{
	String siteLocation;
	
	public HomeLoan(double loanAmount,double interestRate,String siteLocation) {
		super(loanAmount,interestRate);
		this.siteLocation =siteLocation;

	}
	public void diplayHomeLoan() {
		System.out.println("Site Location: "+this.siteLocation);
	}
}
