package polymorphism.methodoverloading;

public class BankDeposit {
		public int deposit(int amount) {
			return amount;
		}
		public String deposit(int amount, long cheque) {
			return "Money as "+amount+" deposited by cheque no: "+cheque;
		}
		
		public String deposit(int amount, long cheque,String paymentMethod) {
			return "Money as "+amount+" deposited by cheque no: "+cheque +" or by using payment method" +paymentMethod;
		}
		
	
}
