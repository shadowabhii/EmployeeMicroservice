package com.employee.microservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.microservice.enitity.Employee;
import com.employee.microservice.services.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/{eId}")
	public Employee getEmployee(@PathVariable("eId") Long eId)
	{
		
		Employee employee = this.employeeService.getEmployee(eId);
		
		return employee;
	}
}
