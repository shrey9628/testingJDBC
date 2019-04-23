package com.pack;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStrore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner sc = new Scanner(System.in);
		 BookDAO bop = new BookDAO();

		while(true)
		{
			System.out.println("1. Add a Book ");
			System.out.println("2. get a book");
			System.out.println("3. get all books");
			System.out.println("4. Delete");
			System.out.println("5. Update");
			System.out.println("8. Inventory");
			System.out.println("7. update");
			System.out.println("Enter the choice");
			int choice  = sc.nextInt();
		   
			
			switch(choice)
			{
			case 1: {
				     System.out.println("Enter the book details");
				     int bookId = sc.nextInt();
				     String bookName = sc.next();
				     int bookPrice = sc.nextInt();
				     Book book = new Book(bookId, bookName,bookPrice);
				      System.out.println(BookDAO.addBook(book));
				    break;
				     
				
				
		          	}
			
			case 2: {
			     System.out.println("Enter the book id");
			     int bookId = sc.nextInt();
			     Book book = BookDAO.getBook(bookId);
			     if(book!=null)
			     {
			    	System.out.println(book); 
			     }
			     else
			       System.out.println("Book not found");
			    break;
			     
			
			
			    
			}
			
			case 7: {
			     System.out.println("Enter the book id");
			     int bookId = sc.nextInt();
			     int bookprice = sc.nextInt();
			     System.out.println(BookDAO.updateBook(bookId,bookprice));
			     
			
			
			    
			}
			default: 
				System.out.println("bye");
				System.exit(0);
			
			
				}
			
		}
		
		
		
		
	}

}
