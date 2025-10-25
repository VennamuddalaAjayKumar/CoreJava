package association.combined;

public class Director {
	private String name;
	private int age;
	public Director(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void details() {
		System.out.println("Director Name: "+this.name);
		System.out.println("Director Age: "+this.age);
	}
}
