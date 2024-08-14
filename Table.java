package Database;

import java.sql.*;

public class Table {

	public static void main(String[] args) {
		try {
			Connection con =DriverManager .getConnection("jdbc:mysql://127.0.0.1:3306/Student2","root","root@1234");
			Statement st =con.createStatement();
			String sql="create table details"+"(id int,"+"name varchar(43),"+"age int,"+"college varchar(42))";
			st.execute(sql);
	        System.out.println("table created!");
			
		}
		catch(SQLException e){
			System.out.println(e);
			}
	}

}
