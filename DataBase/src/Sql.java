import java.sql.*;
import java.util.Scanner;

public class Sql {

	public static void main(String args[]){
		
		
	   Scanner sc = new Scanner(System.in);
		System.out.println("Enter your username");
		String userid = sc.nextLine();
		System.out.println("Enter your password");
		String pass = sc.nextLine();
		
		
			
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mystore","root","1432");
			
			System.out.println("Connected");
			
//			String q = "insert into users values('ayushideshmukh05@gmail.com','janayu05')";
			String q = "insert into users values(? , ?)";
//			Statement sta = con.createStatement();
            PreparedStatement ps = con.prepareStatement(q); 
            ps.setString(1,userid);
            ps.setString(2,pass);
			
		
			
			
			int i = ps.executeUpdate();
			System.out.println(i + " Record Added");
			
		
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
}
