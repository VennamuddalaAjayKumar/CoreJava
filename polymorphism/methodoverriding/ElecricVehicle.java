package polymorphism.methodoverriding;

public class ElecricVehicle extends Vehicle {
	@Override
	public void start() {
		System.out.println("Electric Vehicle starts with a button.");
	}
}
