package library.mum.edu.copy2;

import java.util.HashMap;
import java.util.Map;

public class DataAccess {
	static Map<String, LibraryMember> members = new HashMap<>();

	public static void saveLibraryMember(String fName, LibraryMember member) {
		
		members.put(fName, member);
		System.out.println("Member Saved");
		
	}
	
	public LibraryMember getMember(String fName) {
		return members.get(fName);
	}

	
}
