package employee_ctrl;

import java.sql.PreparedStatement;
import java.net.http.HttpResponse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import connectDBF.connectivity;

public class EmployeeDBUtil {
	public static ArrayList<Employee> validate(String username, String password) {
		try {

			Connection con = connectivity.getConnection();

			Statement st = con.createStatement();
			String q1 = "SELECT * FROM Employee WHERE username='" + username + "' AND pssWrd='" + password + "'";
			ResultSet rs1 = st.executeQuery(q1);

			if (rs1 == null) {
				System.out.println("Login Invalid");
			} else {
				System.out.println("Valid login");
				
				ArrayList<Employee> empAttr= new ArrayList <> () ;

				String q2 = "SELECT returnEmpTy(?,?)";
				// String q3="SELECT @x";

				PreparedStatement ps1 = con.prepareStatement(q2);
				ps1.setString(1, username);
				ps1.setString(2, password);

				ResultSet rs2 = ps1.executeQuery();

				while (rs2.next()) {
					
					String q3="SELECT * FROM Employee WHERE username='"+username+"' AND pssWrd='"+password+"'";
					PreparedStatement ps2=con.prepareStatement(q3);
					ResultSet rs3=ps2.executeQuery();
					
					while(rs3.next()) {
						
						int empID=rs3.getInt(1);
						String name=rs3.getString(2);
						String unitN=rs3.getString(3);
						String strt=rs3.getString(4);
						String town=rs3.getString(5);
						String city=rs3.getString(6);
						int depID=rs3.getInt(7);
						
						Employee empObj= new Employee(empID,name, unitN, strt, town, city, depID, username, password);
						
						empAttr.add(empObj);
						
						return empAttr;
						
						
					}
				}
				
				String mgt = rs2.getString(1);
				if (mgt.equalsIgnoreCase("salary") || mgt.equalsIgnoreCase("accounts") || (mgt.equalsIgnoreCase("manager"))) {
						
					Manager mgr= new Manager(mgt);
						
						
				} else {

						

				}


			}

		} catch (Exception e) {

			e.printStackTrace();

		}
		return null;
	}
}
