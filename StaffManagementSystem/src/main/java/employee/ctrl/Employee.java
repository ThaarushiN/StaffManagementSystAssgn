package employee.ctrl;

import java.util.Date;

public class Employee {
	protected int empNo;
	protected String name, unitNo, stName, town, city;
	protected Date dob;

	private String psswrd;
	private String email;
	
	public Employee(int empNo, String name, String unitNo, String stName, String town, String city, Date dob,
			String psswrd, String email) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.unitNo = unitNo;
		this.stName = stName;
		this.town = town;
		this.city = city;
		this.dob = dob;
		this.psswrd = psswrd;
		this.email = email;
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

	public Date getDob() {
		return dob;
	}

	public String getPsswrd() {
		return psswrd;
	}

	public String getEmail() {
		return email;
	}
	
	
}
