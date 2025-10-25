package ajay;

public class EncapsulationRunner {
		public static void main(String[] args) {
			
			Encapsulation e = new Encapsulation();
			
			e.setName("Ajay");
			e.setAge(24);
			
			System.out.println("Name: "+e.getName());
			System.out.println("Age: "+e.getAge());
		}
}
