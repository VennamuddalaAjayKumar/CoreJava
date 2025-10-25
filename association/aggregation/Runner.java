package association.aggregation;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new Teacher("GURU");
		Department department = new Department("CSE", t);
		department.display();
	}

}
