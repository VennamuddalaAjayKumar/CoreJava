package hierarchy;

public class Employee {
		String eName;
		double salary;
		
		Employee(String eName,double salary){
			this.eName =eName;
			this.salary =salary;
		}
		void dipaly() {
			System.out.println("Employee Name: "+this.eName);
			System.out.println("Salary : "+this.salary);
		}
}
