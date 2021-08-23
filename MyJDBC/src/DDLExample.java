import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDLExample {
public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Loaded");
	
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data5","root","lqs@5");
	System.out.println("connected");
	
	String sql = "Create table test(col1 char, col2 char)";
	
	Statement stmt = con.createStatement();
	
	
	
	
	int n = stmt.executeUpdate(sql);
	System.out.println(n + " table created");
	
	con.close();
}
}
