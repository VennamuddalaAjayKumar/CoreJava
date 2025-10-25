package polymorphism.methodoverloading;

public class Vehicle {
		public void start() {
			
		}
		public String start(String mode) {
			return mode;
		}
		public String start(String mode, String action) {
			return "In using a car ,We can start with a car "+mode+" then it is using action : "+action;
		}
}
