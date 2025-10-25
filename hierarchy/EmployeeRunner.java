package hierarchy;

public class EmployeeRunner {

	public static void main(String[] args) {
	
		Developer d= new Developer("Ajay",100000,"Progaramming Developer");
		d.dDispaly();
		d.dipaly();
		
		Employee e = new Developer("Ajay",100000,"Developer");
		e.dipaly();
		
		
		Manager m = new Manager("Charan",2000000,"Teamsize");
		m.mDisplay();
		m.dipaly();
		
		Employee e1 = new Manager("Charan ",200000,"Teamsize");
		e1.dipaly();
	}

}
