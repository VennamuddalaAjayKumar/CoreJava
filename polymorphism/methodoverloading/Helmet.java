package polymorphism.methodoverloading;

public class Helmet {
	String brand;
	double price;
	
	public void wear() {
		System.out.println("Weared Helmet!!!");
	}
	public String wear(String brand) {
		System.out.println("Weared "+brand+" 's Helmet");
		return "Weared " +brand+"'s helmet";
		
	}
}
