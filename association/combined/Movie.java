package association.combined;

public class Movie {
	private String movieName;
	private Director director;
	private Scene scene;
	public Movie(String movieName, Director director, String sceneName) {
		super();
		this.movieName = movieName;
		this.director = director;
		this.scene = new Scene(sceneName);
	}
	void display() {
		System.out.println("Movie Name: "+this.movieName);
		director.details();
		System.out.println(this.scene.getAction()+" scene is shooting");
	}
	
}
