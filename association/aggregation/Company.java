package association.aggregation;

public class Company {
		String name;
		Employee employee;
	public Company(String name,Employee employee) {
		this.name = name;
		this.employee = employee;
		
	}
	void paying() {
		System.out.println(name+ "will be paid by their employees");
		employee.details();
	}
	public static void main(String[] args) {
		Employee e = new Employee("Ajay", 200000);
		Company company = new Company("Google", e);
		company.paying();
		
	}
	
	

}
