package practice;

import java.sql.*;
public class Select_Query {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/db?useSSL=false","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println("name="+rs.getString(1)+", id="+rs.getInt(2)+
						", mail="+rs.getString(3));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
