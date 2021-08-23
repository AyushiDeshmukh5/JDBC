import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Parameters {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your email id");
		String id =  sc.nextLine();
		System.out.println("Enter your new password");
		String pass = sc.nextLine();
		System.out.println("Enter again");
		String confpass = sc.nextLine();
		if(pass.equals(confpass)){
			
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mystore","root","1432");
			
			System.out.println("Connected");
			
			String q = "update users set password=? where email_id =?;";
			PreparedStatement st = con.prepareStatement(q);
			
			st.setString(2,id);
			st.setString(1,pass);

			
			int i = st.executeUpdate();
			System.out.println(i + "  record Deleted");
			
			
//	ResultSet rs =st.executeQuery();
//			
//			if(rs.next()){
//				System.out.println("id" + "                          "+ "pass");
//				
//				do{
//					System.out.println(rs.getString(1)+ "                       " + rs.getString(2));
//					}
//				while(rs.next()); 
//					
//				}
//			else
//			{
//				System.out.println("Not found!");
//				
//			}
//				
			}
			
		catch(Exception e){
			e.printStackTrace();
			}
		}
		else{
			
			System.out.println("Password does not match");
			
		}
		}

}
