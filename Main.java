package library.mum.edu.copy2;

public class Main {
	
	public static void main(String[] args) {
		Address address = new Address("abc123","Fairfield","Iowa","52557");
		LibraryMember lm = new LibraryMember("lib12","michael","bisrat","9823769",address);	
		SystemControler.addMemeber();
		DataAccess.saveLibraryMember("michael", lm);
		
		
		//System.out.println(ui.handle());
	}

}
