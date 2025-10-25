package association.aggregation;

public class Car {
	String model;
	Driver driver;
	public Car(String model,Driver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.model = model;
	}
	void start() {
		System.out.println(model +" is starting!!!");
		driver.drive();
	}
	public static void main(String[] args) {
		Driver driver2 = new Driver("Sasi");
		Car car = new Car("BMW", driver2);
		car.start();
	}
}
