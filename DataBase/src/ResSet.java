import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class ResSet {
	
	public static void main(String args[]){
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mystore","root","1432");
		
		System.out.println("Connected");
		
		String q = "select * from users;";
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery(q);
		
		if(rs.next()){
			System.out.println("id" + "                          "+ "pass");
			
			do{
				System.out.println(rs.getString(1)+ "                       " + rs.getString(2));
				}
			while(rs.next()); 
				
			}
		else
		{
			System.out.println("Not found!");
			
		}
			
		}
		
	catch(Exception e){
		e.printStackTrace();
		}
	}
}
