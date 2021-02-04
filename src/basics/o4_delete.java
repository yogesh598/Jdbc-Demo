package basics;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
public class o4_delete {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3308/db?useSSL=false";
			String user = "root";
			String password = "";
			
			Connection con = DriverManager.getConnection(url,user,password);
			Statement stmt = con.createStatement();
			stmt.executeUpdate("DELETE from student where id=4;");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
