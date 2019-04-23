package com.pack;

import java.sql.*;

public class BookDAO {

	public static String addBook(Book book)
	
	{
		Connection con = null;
		PreparedStatement ps = null;
		int rows=0;
		String str = "insert into USER1.BOOK values(?,?,?)";
		
		con = DataManager.getConnection();
		try
		{
		ps  = con.prepareStatement(str);
		ps.setInt(1,book.getId());
		ps.setString(2, book.getBname());
		ps.setInt(3,book.getPrice());
		rows = ps.executeUpdate();
		}
		
		
		catch(SQLException e)
		{
			
			e.printStackTrace();
			
		}
		
		
		if(rows!=1)
		{
			return "No rows Updated";
		}
		
		else
		{
			return "1 row is added";
		}
		
	
		
		
		
	}
	
	
	public static String updateBook(int bid , int price)
	
	{
		
	
		Connection con = null;
		PreparedStatement ps = null;
		int rows=0;
		String str = "UPDATE USER1.BOOK set PRICE=? where ID=?";
		
		con = DataManager.getConnection();
		try
		{
		ps  = con.prepareStatement(str);
		//ps.setInt(1,bid);
		//ps.setInt(3, price);
		ps.setInt(1, price);
		ps.setInt(2, bid);
		rows = ps.executeUpdate();
		}
		
		
		catch(SQLException e)
		{
			
			e.printStackTrace();
			
		}
		
		
		if(rows!=1)
		{
			return "No rows Updated";
		}
		
		else
		{
			return "1 row is added";
		}
		
	
		
		
		
	}
	
	
	 
	
	public static Book getBook(int bid)
	{
		Book book = new Book();
		Connection con1 = null;
		PreparedStatement ps1 = null;
		con1 = DataManager.getConnection();
		String str1 = "select * from USER1.BOOK where ID=?";
		
		try
		{
		ps1 = con1.prepareStatement(str1);
		
		
		ps1.setInt(1,bid);
		
	     ResultSet rs = ps1.executeQuery();
		
		while (rs.next())
		
		{
			book.setId(rs.getInt(1));
			book.setBname(rs.getString(2));
			book.setPrice(rs.getInt(3));
		}
		
	}
		
		catch(SQLException e)
		
		{
			e.printStackTrace();
		}
		return book;
		
	}
	
	
	
	
	
}
