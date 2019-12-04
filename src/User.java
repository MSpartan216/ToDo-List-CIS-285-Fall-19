import java.util.ArrayList;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	//public static void main (String args []) {
//		try {
//			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
//			String path = System.getProperty("user.dir")+"\\"+"ToDoDB.accdb";
//			String url = "jdbc:ucanaccess://"+path;
//			Connection con = DriverManager.getConnection(url);
//			System.out.println("Connection successful");
//				try {
//					Statement st = con.createStatement();
//					ResultSet rs = st.executeQuery("SELECT * FROM account");
//					while (rs.next()) {
//						System.out.print(rs.getString(1));
//						System.out.println(""+rs.getString(2));
//					}
//			}
//				catch (Exception ex1) {
//					System.out.println("Unable to locate login credentials");
//				}
//			}
//		catch(Exception ex2) {
//			System.out.println("Unable to establish database connection");
//			}
//	}

	


	public static boolean getName (String userName) {
		try {
			boolean check;
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String path = System.getProperty("user.dir")+"\\"+"ToDoDB.accdb";
			String url = "jdbc:ucanaccess://"+path;
			Connection con = DriverManager.getConnection(url);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM account WHERE name=?");
			String sql ="SELECT * from account where name=?";
			
		}
		catch (Exception ex3) {};
		boolean check = false;
		return check;
		
		
	}
	public void getPass (String userPass) {

}
	public void getPermission (int userName) {
		
	}
	public void setName (String newName) {
		
	}
	public void setPass (String newPass) {
		
	}
	public void getKey (String idk) {
		
	}
	public void setKey (String newidk) {
		
	}
	
}