package association.combined;

public class Cricket {
	private String cricName;
	private CricketGears cricket;
	private Players players;
	public Cricket(String cricName, CricketGears cricket, int playerscount) {
		super();
		this.cricName = cricName;
		this.cricket = cricket;
		this.players = new Players(playerscount);
	}
	void display() {
		System.out.println("Tournament Name: "+this.cricName);
		cricket.details();
		System.out.println("Players Count: "+this.players.getPlayers());
	}
	
}
