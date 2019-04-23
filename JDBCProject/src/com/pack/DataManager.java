package com.pack;

import java.sql.*;

public class DataManager {

	public static Connection getConnection()
	{
		Connection con = null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","shrey");
			
			
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
			
			
			
		}
		
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		return con;
		
		
	}
	
}
