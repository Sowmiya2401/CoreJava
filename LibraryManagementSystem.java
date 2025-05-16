package javaPractice;

import java.util.Scanner;

public class LibraryManagementSystem implements Member{

	 public static String member;
	 public static String librarian;
	 Scanner sc = new Scanner(System.in);
	public LibraryManagementSystem(String member, String librarian){
		this.member = member;
		this.librarian = librarian;
		
	}
	public void MemberLogin(String member)
	{
		
		System.out.println("Are you the Member");
		member = sc.nextLine();
		if(member.equals("yes"))
		{
			System.out.println("please login");
		}
		else
		{
			System.out.println("Pls login to the user portal");
		}
		
	}
	public void LibrarianLogin(String name)
	{
		System.out.println("Welcome to user portal");
		System.out.println("Enter the Name");
		name = sc.nextLine();
		System.out.println("Please see the bookslist");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void bookslisted() {
		// TODO Auto-generated method stub
		Book bk = new Book(member, librarian);
		bk.bookslisted();
		
	}
	@Override
	public void borrow() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void returnBook() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addMember() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeMember() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void membershipNotification() {
		// TODO Auto-generated method stub
		
	}

}
