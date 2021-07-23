package jdbc.model;

import java.sql.Date;

public class EmJoinDe {
	private int employee_id;
	private String first_name;
	private String last_name;
	private String phone_number;
	private Date hire_date;
	private String job_id;
	private int salary;
	private int manager_id;
	private int department_id;
	private String department_name;
	private int location_id;
	
	public EmJoinDe(int employee_id, String first_name, String last_name, String phone_number,
			Date hire_date, String job_id, int salary, int manager_id, int department_id, String department_name,
			int location_id) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.hire_date = hire_date;
		this.job_id = job_id;
		this.salary = salary;
		this.manager_id = manager_id;
		this.department_id = department_id;
		this.department_name = department_name;
		this.location_id = location_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	public String toString() {
		return String.format("%-7d/%-15s/%-15s/%-20s/%-15s/%-15s/%-10d/%-10d/%-10d/%-17s/%d\n", 
				employee_id,  first_name,  last_name,  phone_number,
				 hire_date,  job_id,  salary,  manager_id,  department_id,  department_name,
				 location_id);
	}
	
}




