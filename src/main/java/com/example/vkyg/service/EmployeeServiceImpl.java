package com.example.vkyg.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vkyg.model.Employee;
import com.example.vkyg.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}
	
	@Override
	public void saveEmployee(Employee employee) {
	
		this.employeeRepository.save(employee);
	}

	@Override
	public Employee getEmployeeId(long id) {
	
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee=null;
		if(optional.isPresent())
		{
			employee=optional.get();
		}
		else {
			throw new RuntimeException("Employee not found for id::"+ id);
			
		}
		return employee;
	}

	@Override
	public String deleteEmployeeById(long id) {
		// TODO Auto-generated method stub
		this.employeeRepository.deleteById(id);
		return "redirect:/";
	}

}
