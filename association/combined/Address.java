package association.combined;

public class Address {
	private String cityName;
	private String state;
	private String country;

	public Address(String cityName, String state, String country) {
		super();
		this.cityName = cityName;
		this.state = state;
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	
	void display() {
		System.out.println("City: "+this.cityName);
		System.out.println("State: "+this.state);
		System.out.println("Country: "+this.country);
	}
}
