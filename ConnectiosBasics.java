package Basics;

import java.sql.*;

public class ConnectiosBasics {

	public static void main(String[] args) {
		try {
			
            Class.forName("com.mysql.cj.jdbc.Driver"); //registration
			
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://127.0.0.1:3306/basicdb","root","root@1234"); //connection
			
			Statement stmt = con.createStatement(); // create stmt
			
			ResultSet rs=stmt.executeQuery("select * from customer");  //Query
			while(rs.next())  
				
		    System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			
		    con.close();    //close connection
		System.out.println("table displayed successfully!!!");
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

	}


