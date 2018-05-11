package library.mum.edu.copy2;

import java.util.ArrayList;
import java.util.List;

public class CheckOutRecord {
	private List<CheckoutRecordEntry> checkoutRecordEntries;
	private LibraryMember librarianMember;

	public CheckOutRecord( LibraryMember librarianMember) {		
		this.librarianMember = librarianMember;
		checkoutRecordEntries = new ArrayList<>();
	}

}
