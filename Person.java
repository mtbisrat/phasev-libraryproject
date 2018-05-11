package library.mum.edu.copy2;

public class Person {
	private String ID;
	private String firtsName;
	private String lastName;
	private Address address;
	
	public Person(String iD, String firtsName, String lastName, Address address) {
		this.ID = iD;
		this.firtsName = firtsName;
		this.lastName = lastName;
		this.address = address;
	}
	
	public String getID() {
		return this.ID;
	}
	
}
