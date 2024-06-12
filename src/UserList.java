import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UserList {	
	
	
	public static ArrayList<String[]> getTaskList () { //Returns an arraylist thats a carbon copy of the user_tasks table. (which will contain all the tasks for every user)
		ArrayList <String[]> taskList = new ArrayList<String[]>();
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String path = System.getProperty("user.dir")+"\\"+"ToDoDB.accdb";
			String url = "jdbc:ucanaccess://"+path;
			Connection con = DriverManager.getConnection(url);
				try {
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("SELECT * FROM user_tasks");
					
					int columnCount = rs.getMetaData().getColumnCount();
					while(rs.next())
					{
					    String[] row = new String[columnCount];
					    for (int i=0; i <columnCount ; i++)
					    {
					       row[i] = rs.getString(i + 1);
					    }
					    taskList.add(row);
					}
					
			}
				catch (Exception ex1) {
					System.out.println("Unable to locate account credentials");
				}
			}
		catch(Exception ex2) {
			System.out.println("Unable to establish database connection");
			}
		
		return taskList;
	}

	
	}


