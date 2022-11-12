package employee_ctrl;

import java.util.Date;

public class Employee {
	protected int empNo, depID;
	protected String name, unitNo, stName, town, city;


	protected String psswrd;
	protected String username;
	
	public Employee(int empNo, String name, String unitNo, String stName, String town, String city, int depID, String username,
			String psswrd) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.unitNo = unitNo;
		this.stName = stName;
		this.town = town;
		this.city = city;
		this.depID= depID;
		this.username=username;
		this.psswrd = psswrd;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public String getUnitNo() {
		return unitNo;
	}

	public String getStName() {
		return stName;
	}

	public String getTown() {
		return town;
	}


	public String getCity() {
		return city;
	}

	public int getDepID() {
		return depID;
	}

	public String getPsswrd() {
		return psswrd;
	}

	public String getUsername() {
		return username;
	}
	
	
}
