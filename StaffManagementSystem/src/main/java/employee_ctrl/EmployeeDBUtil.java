package employee_ctrl;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import connectDBF.connectivity;

public class EmployeeDBUtil {
	public static void validate(String username, String password) {
		try {

			Connection con = connectivity.getConnection();

			Statement st = con.createStatement();
			String q1 = "SELECT * FROM Employee WHERE username='" + username + "' AND pssWrd='" + password + "'";
			ResultSet rs1 = st.executeQuery(q1);

			if (rs1 == null) {
				System.out.println("Login Invalid");
			} else {
				System.out.println("Valid login");

				String q2 = "SELECT returnEmpTy(?,?)";
				// String q3="SELECT @x";

				PreparedStatement ps1 = con.prepareStatement(q2);
				ps1.setString(1, username);
				ps1.setString(2, password);

				ResultSet rs2 = ps1.executeQuery();

				while (rs2.next()) {
					String mgt = rs2.getString(1);
					if (mgt.equalsIgnoreCase("salary")) {

					} else if (mgt.equalsIgnoreCase("accounts")) {

					} else if (mgt.equalsIgnoreCase("manager")) {

					} else {
						// redirect to profile
						String q3="SELECT * FROM Employee WHERE username='"+username+"' AND pssWrd='"+password+"'";
						PreparedStatement ps2=con.prepareStatement(q3);
						ResultSet rs3=ps2.executeQuery();
						
						while(rs3.next()) {
							Employee empObj= new Employee(rs2.getInt(1),rs2.getString(2),rs2.getString(3),rs2.getString(4),rs2.getString(5),rs2.getString(6), rs2.getInt(7), rs2.getString(8), rs2.getString(9));
						}
						
						
						
					}
				}


			}

		} catch (Exception e) {

			e.printStackTrace();

		}
	}
}
