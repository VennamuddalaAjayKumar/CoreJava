package association.aggregation;

public class Department {
		String name;
		Teacher teacher;
	public Department(String name,Teacher teacher) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.teacher = teacher;
	}
	void display() {
		System.out.println(name +" Department - "+teacher.name);
	}

}
