package basics;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
public class o3_Update {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/db?useSSL=false","root","");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("UPDATE student set name='Yogesh Kumar' WHERE id=1;");
			System.out.println("Records updated successfullt..!!!");
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
