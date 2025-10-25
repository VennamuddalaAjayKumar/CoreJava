package hierarchy;

public class Developer extends Employee  {
		
	String role;
	
	public Developer(String eName,double salary,String role) {
		
		super(eName,salary);
		this.role =role;
		
		
	}
	void dDispaly() {
		System.out.println("Role : "+this.role);
	}

}
