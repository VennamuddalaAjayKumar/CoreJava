package polymorphism.methodoverloading;

public class VehicleRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v=new Vehicle();
		
		System.out.println(v.start("Normal"));
		System.out.println(v.start("Normal","Key"));
	}

}
