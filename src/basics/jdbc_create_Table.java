package basics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class jdbc_create_Table {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3308/db?uesSSL=false","root","");
			Statement stmt = con.createStatement();
			stmt.executeUpdate("create table student(id int(10),name char(20),salary int(10),primary key(id));");
			//stmt.executeUpdate("insert into student values(1,'yogesh',35000);");
			//stmt.executeUpdate("DROP TABLE student;");
			System.out.println("Inserted into student");
			con.close();

		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}