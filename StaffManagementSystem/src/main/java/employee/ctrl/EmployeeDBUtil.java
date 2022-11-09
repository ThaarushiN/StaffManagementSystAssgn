package employee.ctrl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import com.mysql.jdbc.PreparedStatement;

public class EmployeeDBUtil {
	public static void validate(String username, String password) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url="jdbc:sqlserver://DESKTOP-FJEQ3PG/SQLEXPRESS;databaseName=StaffManagementSyst";
			Connection con=DriverManager.getConnection(url, "webDev", "191083");
			
			Statement st=con.createStatement();
			
			String sql="SELECT EXISTS(SELECT * FROM Employee WHERE username='"+username+"' AND pssWrd='"+password+"' )";
			ResultSet rs=st.executeQuery(sql);
			
			boolean isValidt=Boolean.parseBoolean(sql);
			
			if(isValidt==true) {
				
				String sql_q_1="SELECT empNo FROM EMPLOYEE WHERE username='"+username+"' AND pssWrd='"+password+"' )";
				int empNo=Integer.parseInt(sql_q_1);
				
				java.sql.PreparedStatement p=con.prepareStatement("SELECT EXISTS(SELECT * FROM Manager WHERE empNo=?)");
				
				p.setInt(1, empNo);
				
				
				Boolean isManager=
				
			}
			
			 
			
		}catch(Exception e) 
			
		}
	}
}
