package polymorphism.methodoverloading;

public class BankDepositRunner {

	public static void main(String[] args) {
		BankDeposit bd = new BankDeposit();
			System.out.println(bd.deposit(1000000));
			System.out.println(bd.deposit(1000000,1575523l));
			System.out.println(bd.deposit(100000,21545114l, "Offline"));
	}

}
