package com.employee;

public class Employee {
	private int empId;
	private String empName;
	private Department department;
	public Employee(int empId, String empName, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	

}
