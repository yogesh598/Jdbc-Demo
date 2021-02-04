package practice;

import java.sql.*;
public class Insert_Query {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/db?useSSL=false","root","");
			Statement stmt = con.createStatement();
			int i = stmt.executeUpdate("insert into student(name,id,mail)"+
					"values('Thulasi',24,'Thulasi@gmail.com')");
			System.out.println(i+" record's inserted");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
