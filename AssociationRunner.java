package abstraction.interfaces;

public class AssociationRunner {

	public static void main(String[] args) {
			Student s = new Student("Shishya");
			Teacher t = new Teacher("Guru");
			
			Department d = new Department("CSE");
			System.out.println(s.name +" belongs to "+d.name);
			System.out.println(t.name + " teaches "+s.name);
			

	}

}
