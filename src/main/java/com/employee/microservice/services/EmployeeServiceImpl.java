package com.employee.microservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.microservice.enitity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	// Dummy employee list

	List<Employee> list = List.of
			(new Employee(1313L, "peter", "23456"), 
			new Employee(1314L, "John", "123"),
			new Employee(1315L, "Park", "765"),
			new Employee(1316L, "Steven", "3456"),
			new Employee(1317L, "James", "097"),
			new Employee(1318L, "Jonathan", "099"),
			new Employee(1319L, "Jacquab", "094")

	);

	@Override
	public Employee getEmployee(Long id) {

		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}

}
