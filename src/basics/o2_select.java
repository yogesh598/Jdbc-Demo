package basics;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class o2_select {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/db?useSSL=false","root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * from student;");
			while(rs.next()) {
				System.out.println("Id = "+rs.getInt(1)+", Name = "+rs.getString(2)+", Salary = "+rs.getInt(3));
			}
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
