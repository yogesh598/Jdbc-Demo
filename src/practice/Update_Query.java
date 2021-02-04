package practice;

import java.sql.*;
public class Update_Query {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/db?useSSL=false","root","");
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("update student set name='Hari' where id =24");
			System.out.println(i+" record's updated");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
