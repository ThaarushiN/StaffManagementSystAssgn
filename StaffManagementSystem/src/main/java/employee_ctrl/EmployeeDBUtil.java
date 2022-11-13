package employee_ctrl;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import connectDBF.connectivity;

public class EmployeeDBUtil {
	
	static Connection con = connectivity.getConnection();
	private static String username, password;


	public static boolean validate(String username, String password) { //return non specific arraylist


		try {

			//sql statements for actual validation
			Statement st = con.createStatement();
			String validationQ = "SELECT * FROM Employee WHERE username='" + username + "' AND pssWrd='" + password + "'";
			ResultSet validationOutput = st.executeQuery(validationQ);

			
			if (validationOutput == null) {

				System.out.println("Login Invalid");
				
				return false;

			} else {

				while(validationOutput.next()) {
					System.out.println("Valid login");
					
					EmployeeDBUtil.username=username;
					EmployeeDBUtil.password=password;
					
					return true;
				}
					
			}
			
			
				
		}catch (Exception e) {

			e.printStackTrace();

		}
		return false;
		
	}
	
	
	
	public static boolean isManager() {
		//sql function to retrieve manager type
		try {
			
			String returnEmpTyPrcedure = "CALL returnEmpTy(?,?)";
			PreparedStatement ps1 = con.prepareStatement(returnEmpTyPrcedure);
			ps1.setString(1, EmployeeDBUtil.username);
			ps1.setString(2, EmployeeDBUtil.password);
			ResultSet returnEmpTyOutput = ps1.executeQuery();
			

			if (returnEmpTyOutput.next()==true) { //if employee is a manager 
				
				 	return true;
				}		
						
			}catch(Exception e) {
				e.printStackTrace();

			}
		return false;
	}
	
	
	
	public static ArrayList<Employee> getProfile(){
		try {
			
		
			String empTableQ="SELECT * FROM Employee WHERE username='"+EmployeeDBUtil.username+"' AND pssWrd='"+EmployeeDBUtil.password+"'";
			PreparedStatement ps2=con.prepareStatement(empTableQ);
			ResultSet empTableOutput=ps2.executeQuery();
		
			while(empTableOutput.next()) {
			
				int empID=empTableOutput.getInt(1);
				String name=empTableOutput.getString(2);
				String unitN=empTableOutput.getString(3);
				String strt=empTableOutput.getString(4);
				String town=empTableOutput.getString(5);
				String city=empTableOutput.getString(6);
				int depID=empTableOutput.getInt(7);
			
			Employee empObj= new Employee(empID,name, unitN, strt, town, city, depID, username, password);
			
			ArrayList<Employee> empAttr= new ArrayList<>();
			empAttr.add(empObj);
			
			return empAttr;
			
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}

