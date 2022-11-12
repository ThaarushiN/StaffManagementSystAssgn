package employee_ctrl;

public class Manager extends Employee {
	
	private String mgrType;

	public Manager(String mgrType) {
		super(empNo, name, unitNo, stName, town, city, depID, username, psswrd);
	}
	
	public Manager(int empNo, String name, String unitNo, String stName, String town, String city, int depID,
			String username, String psswrd, String mgrType) {
		super(empNo, name, unitNo, stName, town, city, depID, username, psswrd);
		this.mgrType = mgrType;
	}

	public String getMgrType() {
		return mgrType;
	}
	
	
	

//	public Manager(int empNo, String name, String unitNo, String stName, String town, String city, int depID,
//			String username, String psswrd) {
//		super(empNo, name, unitNo, stName, town, city, depID, username, psswrd);
//		// TODO Auto-generated constructor stub
//	}
	
	

}
