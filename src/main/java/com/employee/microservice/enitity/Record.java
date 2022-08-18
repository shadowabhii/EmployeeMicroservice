package com.employee.microservice.enitity;

public class Record {

	private long cid;
	private String email;
	private String companyName;
	private long eId;
	
	
	public Record() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Record(long cid, String email, String companyName, long eId) {
		super();
		this.cid = cid;
		this.email = email;
		this.companyName = companyName;
		this.eId = eId;
	}
	public long getCid() {
		return cid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public long geteId() {
		return eId;
	}
	public void seteId(long eId) {
		this.eId = eId;
	}
	 
}
