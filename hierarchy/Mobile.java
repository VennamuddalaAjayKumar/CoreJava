package hierarchy;

public class Mobile {
		private String name;
		private String brand;
		private double price;
	public Mobile() {
		System.out.println("Mobile is created..");
	}
	
	public Mobile(String name) {
		this();
		this.name =name;
	}
	public Mobile(String name,String brand) {
		this(name);
		this.brand =brand;
	}
	public Mobile(String name,String brand,double price) {
		this(name,brand);
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void display() {
		System.out.println(this.getName());
		System.out.println(this.getBrand());
		System.out.println(this.getPrice());
	}
}
