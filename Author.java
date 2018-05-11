package library.mum.edu.copy2;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
	private String credentials;
	private List<Book> books;

	public Author(String ID, String firtsName, String lastName, Address address, String credentials) {
			super(ID, firtsName, lastName, address);
		this.credentials = credentials;
		books = new ArrayList<>();
	}	
	
}
