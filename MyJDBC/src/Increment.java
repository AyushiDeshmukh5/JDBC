import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Increment {
public static void main(String[] args) throws Exception {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter increment amount: ");
int amount = sc.nextInt();

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data5","root","lqs@5");

String sql ="update emo set sal = sal+?";//parameterized sql

//to send parametized sql, create an object of prepared statement
PreparedStatement ps = con.prepareStatement(sql);
ps.executeUpdate();
}
}
