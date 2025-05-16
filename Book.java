package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class Book extends LibraryManagementSystem implements Member, Librarian{

	
	public Book(String member, String librarian) {
		super(member, librarian);
		// TODO Auto-generated constructor stub
	}

	public void bookslisted()
	{
		ArrayList<String> bookslist = new ArrayList<>();
		bookslist.add(1, "HarryPotter by J.K.Rowling");
		bookslist.add(2, "Power of Now by echoat toll");
		bookslist.add(3, "New Earth by echoat toll");
		bookslist.add(4, "Psychology of money by xx");
		bookslist.add(5, "Do Big by xx");
	}

	@Override
	public void readBooks() {
		// TODO Auto-generated method stub
		
	}
}
