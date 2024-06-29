package com.employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		Department dept1 = new Department(1, "HR");
		Department dept2 = new Department(2, "IT");
		Department dept3 = new Department(3, "Finance");

		List<Employee> employees = new ArrayList<>();
		Employee employee1 = new Employee(1, "John", dept1);
		Employee employee2 = new Employee(2, "Jane", dept1);
		Employee employee3 = new Employee(3, "Doe", dept2);
		Employee employee4 = new Employee(4, "Smith", dept2);
		Employee employee5 = new Employee(5, "Alex", dept2);
		Employee employee6 = new Employee(6, "Emily", dept3);
		Employee employee7 = new Employee(7, "Tom", dept3);

		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);
		employees.add(employee6);
		employees.add(employee7);

		// Counting employees per department
		Map<Department, Integer> departmentEmployeeCount = new HashMap<>();

		for (Employee emp : employees) {
			Department dept = emp.getDepartment();
			if (departmentEmployeeCount.containsKey(dept)) {
				departmentEmployeeCount.put(dept, departmentEmployeeCount.get(dept) + 1);
			} else {
				departmentEmployeeCount.put(dept, 1);
			}

		}

		// Finding department with highest employees
		Department departmentWithHighestEmployees = null;
		int maxEmployees = 0;

		for (Map.Entry<Department, Integer> entry : departmentEmployeeCount.entrySet()) {
			if (entry.getValue() > maxEmployees) {
				maxEmployees = entry.getValue();
				departmentWithHighestEmployees = entry.getKey();
			}
		}

		// Output
		if (departmentWithHighestEmployees != null) {
			System.out.println(
					"Department with highest number of employees is: " + departmentWithHighestEmployees.getDeptName());
			System.out.println("Number of employees: " + maxEmployees);
		} else {
			System.out.println("No departments found.");
		}
	}

}
