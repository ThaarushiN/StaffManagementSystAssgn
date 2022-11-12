package employee_ctrl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectDBF.connectivity;

public class mgrDBUtil {
	
	public static Connection con=connectivity.getConnection();
	
	
	public static void changeOtRt(Double newOtRt) {
		

		String q1="CALL updateOtRate(?)";
		
		PreparedStatement ps1;
		try {
			ps1 = con.prepareStatement(q1);
			ps1.setDouble(1, newOtRt);
			ResultSet rs1 = ps1.executeQuery();
			
			if(rs1==null) {
				System.out.println("updation unsuccessful");
			}else {
				System.out.println("Successfully updated");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void changeHrlyRt(Double newHrlyRt) {
		String q1="CALL updateHrlyRate(?)";
		
		PreparedStatement ps1;
		try {
			ps1 = con.prepareStatement(q1);
			ps1.setDouble(1, newHrlyRt);
			ResultSet rs1 = ps1.executeQuery();
			
			if(rs1==null) {
				System.out.println("updation unsuccessful");
			}else {
				System.out.println("Successfully updated");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
