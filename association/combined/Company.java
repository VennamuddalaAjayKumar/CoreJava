package association.combined;

public class Company {
	private String companyName;
	private Address address;
	private Employee employee;
	public Company(String companyName,String employeeName,Address address) {
		super();
		this.companyName = companyName;
		
		this.employee = new Employee(employeeName);
		this.address = address;
	}
	public void display() {
		System.out.println("Company Name: "+this.companyName);
		System.out.println("Employee name: "+this.employee.getName());
		address.display();
	}
}
