package association.aggregation;

public class Library {
	private Book book;
	public Library(String name) {
		// TODO Auto-generated constructor stub
		book = new Book(name );
	}
	public void showBook() {
		System.out.println("Book: "+book.name);
	}

}
