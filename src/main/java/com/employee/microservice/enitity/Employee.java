package com.employee.microservice.enitity;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private int eId;
	private String name;
	private String phone;
	
	List<Record> records = new ArrayList<>();

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

	public Employee(int eId, String name, String phone, List<Record> records) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
		this.records = records;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String name, String phone) {
		super();
		this.eId = eId;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", phone=" + phone + "]";
	}
	
	
	

}
