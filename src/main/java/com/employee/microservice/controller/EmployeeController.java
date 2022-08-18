package com.employee.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.employee.microservice.enitity.Employee;
import com.employee.microservice.services.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	
	//annotaion for microservice
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{eId}")
	public Employee getEmployee(@PathVariable("eId") Long eId)
	{
		
		Employee employee = this.employeeService.getEmployee(eId);
		//code for linking 2 microservice where record list will be set to employee
		
		List record = 	this.restTemplate.getForObject("http://localhost:9091/record/emp/"+eId, List.class);
		employee.setRecords(record);
		
		
		return employee;
	}
}
