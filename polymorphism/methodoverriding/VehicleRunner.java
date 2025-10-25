package polymorphism.methodoverriding;

public class VehicleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Vehicle v = new Vehicle();
			v.start();
			Vehicle ev = new ElecricVehicle();
			ev.start();
	}

}
