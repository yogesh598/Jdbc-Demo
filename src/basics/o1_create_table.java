package basics;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
public class o1_create_table {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3308/db?useSSL=false","root","");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("CREATE TABLE student(id int(10),name char(20),salary int(20),primary key(id));");
		System.out.println("table is created");
		stmt.executeUpdate("INSERT INTO student values(1,'Yogesh',7000);");
		stmt.executeUpdate("INSERT INTO student values(2,'Thulasi',15000);");
		stmt.executeUpdate("INSERT INTO student values(3,'Naresh',14000);");
		stmt.executeUpdate("INSERT INTO student values(4,'Narendra',20000);");
		con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
