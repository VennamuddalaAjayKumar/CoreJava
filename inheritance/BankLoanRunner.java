package inheritance;

public class BankLoanRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HomeLoan home = new HomeLoan(50000,12,"BTM Layout");
		home.diplayHomeLoan();
		home.displayBankLoan();
		BankLoan bank =new HomeLoan(10000.0,10.0,"chickmangalur");
		bank.displayBankLoan();
	}

}
