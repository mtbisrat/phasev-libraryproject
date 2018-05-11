package library.mum.edu.copy2;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private String ID;
	private String tittle;
	private Integer maxCheckoutLenght;
	List<Author> authors;
	
	public Book(String iD, String tittle, Integer maxCheckoutLenght) {
		ID = iD;
		this.tittle = tittle;
		this.maxCheckoutLenght = maxCheckoutLenght;
		authors  = new ArrayList<>();
	}	
	
}
