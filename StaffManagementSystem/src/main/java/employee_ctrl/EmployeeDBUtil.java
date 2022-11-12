package employee_ctrl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import connectDBF.connectivity;


public class EmployeeDBUtil {
	public static void validate(String username, String password) {
		try {
			
			Connection con=connectivity.getConnection();
			
			Statement st=con.createStatement();
			String q1="SELECT * FROM Employee WHERE username='"+username+"' AND pssWrd='"+password+"'";
			ResultSet rs=st.executeQuery(q1);
			
			
			
			if(rs==null) {
				System.out.println("Login Invalid");
			}else {
				System.out.println("Valid login");
				
				String q2="{CALL returnEmpTy(?,?,?)}";
					
				CallableStatement EmpTy=con.prepareCall(q2);
				
				EmpTy.setString(1, username);
				EmpTy.setString(2, password );
				
				EmpTy.registerOutParameter(3, java.sql.Types.VARCHAR);
				
				
				String mgrType=EmpTy.getString(3);
				
				System.out.println(mgrType);
				
				
			}
					
			
		}catch(Exception e) {
		
			e.printStackTrace();
			
		}
	}
}
