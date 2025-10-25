package abstraction.interfaces;

public abstract class Bank {
	
			public Bank(){
				System.out.println("Bank Constructor called!!!");
			}
			abstract void rateofInterest();
			
			public void welcome() {
				System.out.println("Welcome to Our Bank Sir/Madam!!!!");
			}
}
