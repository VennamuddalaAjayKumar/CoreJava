package association.aggregation;

public class Human {
		private Heart heart;
		
	public Human() {
		heart = new Heart();
		}
	public void startPump() {
		heart.pump();
	}
	public static void main(String[] args) {
		Human h  = new Human();
		h.startPump();
	}
	
}
