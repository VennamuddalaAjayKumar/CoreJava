package association.combined;

public class CompanyRunner {

	public static void main(String[] args) {
		Address address = new Address("Bengaluru","Karnataka","India");
		Company company = new Company("Google","Ajay",address);
		company.display();
	}

}
