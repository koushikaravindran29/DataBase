package Database;

import java.sql.*;

public class Dbcreate {

	public static void main(String[] args) {
		try {
			Connection con =DriverManager .getConnection("jdbc:mysql://127.0.0.1:3306/basicdb","root","root@1234");
			Statement st =con.createStatement();
			String sql="create database Student2";
			
			st.execute(sql);
	        System.out.println("table created!!");
			
		}
		catch(SQLException e){
			System.out.println(e);
			}

	}

}
