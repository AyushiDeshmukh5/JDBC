import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dataentry {
public static void main(String[] args)
{
	//this code will enter new record in emp table
	
	//step 1 (Driver loading)
	try{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver loaded");
	
//	step- 2 (connection establishment)
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data5","root","lqs@5");
	System.out.println("Connected");
	
//	step- 3 (define a sql command)
	String sql = "INSERT into emp values(6,'shila', 60000),(1,'Ayu', 70000),(3,'Chris', 35000),(5,'ben', 65000),(4,'Jos', 45000)";
	
//	Step- 4(dispatching sql command to db using statement object)
	
	Statement stmt = con.createStatement();
	int n = stmt.executeUpdate(sql);
	System.out.println(n);
	
//	step- 5(close the conncetion)
	con.close();
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	
}
}

