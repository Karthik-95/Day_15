package Day14;

public class UseLibrary {
	public static void main(String[] args) {
	Book book=new Book();
	book.title="Ponniyin Selvan";
	book.author="Kalki";
	book.price=700;
	Library library=new Library();
	library.libraryName="ABC";
	library.location="Chennai";
	library.book=book;
	System.out.println(library.book.author);
	}

}
