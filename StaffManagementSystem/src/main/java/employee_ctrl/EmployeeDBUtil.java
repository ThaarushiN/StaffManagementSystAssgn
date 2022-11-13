package employee_ctrl;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

import connectDBF.connectivity;

public class EmployeeDBUtil {


	public static ArrayList validate(String username, String password) { //return non specific arraylist


		try {

			Connection con = connectivity.getConnection();

			//sql statements for actual validation
			Statement st = con.createStatement();
			String validationQ = "SELECT * FROM Employee WHERE username='" + username + "' AND pssWrd='" + password + "'";
			ResultSet validationOutput = st.executeQuery(validationQ);

			
			//if record exists check if employee is a manager
			if (validationOutput == null) {

				System.out.println("Login Invalid");

			} else {

				System.out.println("Valid login");
				
				//retrieve employee table data
				String empTableQ="SELECT * FROM Employee WHERE username='"+username+"' AND pssWrd='"+password+"'";
				PreparedStatement ps2=con.prepareStatement(empTableQ);
				ResultSet empTableOutput=ps2.executeQuery();
				
				//values of emptable
				int empID, depID;
				String name, unitN, strt, town, city;
			
				while(empTableOutput.next()) {
					
					empID=empTableOutput.getInt(1);
					name=empTableOutput.getString(2);
					unitN=empTableOutput.getString(3);
					strt=empTableOutput.getString(4);
					town=empTableOutput.getString(5);
					city=empTableOutput.getString(6);
					depID=empTableOutput.getInt(7);
			
				
				

					//sql function to retrieve manager type
					String returnEmpTyPrcedure = "SELECT returnEmpTy(?,?)";
					PreparedStatement ps1 = con.prepareStatement(returnEmpTyPrcedure);
					ps1.setString(1, username);
					ps1.setString(2, password);
					ResultSet returnEmpTyOutput = ps1.executeQuery();
					
	
					if (returnEmpTyOutput.next()==true) { //if employee is a manager create manager obj
						
						String mgt = returnEmpTyOutput.getString(1);
						
						ArrayList <Manager> mgrAttr= new ArrayList <> ();	
						Manager mgrObj = new Manager(empID,name, unitN, strt, town, city, depID, username, password, mgt);
						mgrAttr.add(mgrObj);
						
						return mgrAttr;
						
						
					
					} else {//otherwise create employee obj
							
							ArrayList<Employee> empAttr= new ArrayList <> () ;
							Employee empObj= new Employee(empID,name, unitN, strt, town, city, depID, username, password);
							empAttr.add(empObj);
					
							return empAttr;
							
					}
					
				}
				
			}
				

			
		}catch (Exception e) {

			e.printStackTrace();

		}
		
	return null;
	
	}
}

