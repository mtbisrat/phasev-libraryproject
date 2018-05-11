package library.mum.edu.copy2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckoutRecordEntry {
	private Date checkOutDate;
	private Date dueDate;
	private List<CopyBook> copyBooks;

	public CheckoutRecordEntry(Date checkOutDate, Date dueDate) {
		this.checkOutDate = checkOutDate;
		this.dueDate = dueDate;
		copyBooks = new ArrayList<>();
	}
}
