package library.mum.edu.copy2;

public class SystemControler {
	//get Address data
	static String street;
	static String city;
	static String state;
	static String zip;
	
	
//	get member data
	static String id;
	static String fName;
	static String lName;
	static String tel;
	
	
	static Address address ;
	
	static LibraryMember member;

	
	 static void addMemeber() {
//		getMemberData();
//		getAddressData();
		 
		address = new Address(street, city, state, zip);
		member = new LibraryMember(id, fName, lName, tel, address);
		
		
		DataAccess.saveLibraryMember(fName, member);
		System.out.println("Member created");
	}

}
