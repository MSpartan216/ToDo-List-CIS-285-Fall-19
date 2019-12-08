import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class User {
	
	private String userName;
	private String userPass;
	private String userPermiss;
	private String userKey;
	
	public static void dbConnect () {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String path = System.getProperty("user.dir")+"\\"+"ToDoDB.accdb";
			String url = "jdbc:ucanaccess://"+path;
			Connection con = DriverManager.getConnection(url);
			System.out.println("Connection successful");
				try {
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("SELECT * FROM account");
					while (rs.next()) {
						System.out.print(rs.getInt(1));
						System.out.print(" "+rs.getString(2));
						System.out.print(" "+rs.getString(3));
						System.out.println("");
					}
			}
				catch (Exception ex1) {
					System.out.println("Unable to locate login credentials");
				}
			}
		catch(Exception ex2) {
			System.out.println("Unable to establish database connection");
			}
	}

	public String getName () {
		return userName;
	}
	
	public String getPass () {
		return userPass;
	}
	
	public String getPermission () {
		return userPermiss;	
	}
	
	public void setName (String name) {	
		this.userName = name;
	}
	
	public void setPass (String pass) {
		this.userPass = pass;
		
	}
	
	public String getKey (String key) {
		return userKey;
		
	}
	
}