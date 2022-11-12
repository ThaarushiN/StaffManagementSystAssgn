package connectDBF;

import java.sql.*;

public class connectivity {
	
	private static String url="jdbc:mysql://localhost:1433/StaffManagementSystem?";
	private static String username="root";
	private static String pass="191083";
	private static Connection con;
	
	public static Connection getConnection() {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(url, username, pass);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return con;
	}
	
	
}
