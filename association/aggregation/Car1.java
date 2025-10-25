package association.aggregation;

public class Car1 {
	private String carName;
	private Engine engine;
	private CarDriver driver;
	
	public Car1(String carName, String model, CarDriver driver2) {
		this.carName = carName;
		this.driver = driver2;
		this.engine = new Engine(model);
		
	}
	void display1() {
		System.out.println("Car name: "+carName);
		engine.model();
		driver.display();
		
	}

}
