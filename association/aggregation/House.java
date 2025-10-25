package association.aggregation;

public class House {
	private Room room;
	public House(String name) {
		// TODO Auto-generated constructor stub
		room = new Room(name);
		
	}
		public void showRoom() {
			System.out.println("Room : "+room.name);
		}
}
