package association.combined;

public class MovieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Director director = new Director("Rajamouli", 45);
			Movie movie = new Movie("SSMB29", director, "Action");
			movie.display();
	}

}
