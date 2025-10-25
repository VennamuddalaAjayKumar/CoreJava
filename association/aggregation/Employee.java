package association.aggregation;

public class Employee {
		String name;
		double salary;
	public Employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	void details() {
		System.out.println(name+ " is gained by "+salary+" per month in their company");
	}

}
