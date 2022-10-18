package com.example.vkyg.service;

import java.util.List;

import com.example.vkyg.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeId(long id);
	String deleteEmployeeById(long id);
}
