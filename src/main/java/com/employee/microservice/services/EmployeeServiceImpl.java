package com.employee.microservice.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.microservice.enitity.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	// Dummy employee list

	List<Employee> list = List.of(new Employee(1234L, "peter", "23456"), new Employee(25678L, "John", "123"),
			new Employee(323456L, "Park", "765"), new Employee(412345L, "Steven", "3456"),
			new Employee(51234L, "James", "098")

	);

	@Override
	public Employee getEmployee(Long id) {

		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}

}
