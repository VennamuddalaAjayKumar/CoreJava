package association.combined;

public class Customer {
	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	void display() {
		System.out.println("Customer Name: "+this.name);
	}
}
