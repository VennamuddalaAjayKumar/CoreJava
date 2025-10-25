package polymorphism.methodoverloading;

public class BankRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi =new SBI();
		Hdfc hdfc =new Hdfc();
		System.out.println("SBI Rate: "+sbi.getRateOfInterest());
		System.out.println("HDFC Rate: "+hdfc.getRateOfInterest());
	}

}
