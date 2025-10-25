package association.combined;

public class CricketGears {
	private String name;

	public CricketGears(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	void details() {
		System.out.println("Cricket Gear Name: "+this.name);
	}
}
