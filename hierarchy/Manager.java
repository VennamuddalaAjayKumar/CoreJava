package hierarchy;

public class Manager extends Employee{

	String role1;
	public Manager(String eName,double salary,String role1) {
		super(eName,salary);
		this.role1 = role1;
	}
	void mDisplay() {
		System.out.println("Manager does "+this.role1);
	}

}
