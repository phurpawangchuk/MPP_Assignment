package LibraryMgtSystem.dataaccess;

import java.util.HashMap;

import LibraryMgtSystem.business.Book;
import LibraryMgtSystem.business.LibraryMember;

public interface DataAccess { 
	public HashMap<String,Book> readBooksMap();
	public HashMap<String,User> readUserMap();
	public HashMap<String, LibraryMember> readMemberMap();
	public void saveNewMember(LibraryMember member); 
}
