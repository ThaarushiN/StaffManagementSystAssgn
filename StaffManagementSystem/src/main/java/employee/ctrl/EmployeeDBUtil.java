package employee.ctrl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class EmployeeDBUtil {
	public static void validate(String username, String password) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url="jdbc:sqlserver://localhost:1433;databaseName=StaffManagementSyst";
			Connection con=DriverManager.getConnection(url, "root", " ");
			Statement st=con.createStatement();
			
			String sql="SELECT EXISTS(SELECT * FROM Employee WHERE username='"+username+"' AND pssWrd='"+password+"' )";
			ResultSet rs=st.executeQuery(sql);
			
			int result=Integer.parseInt(sql);
			
			if(result==1) {
				String sql1=
			}
		}catch(Exception e) {
			
		}
	}
}
