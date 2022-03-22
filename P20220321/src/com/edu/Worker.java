package com.edu;

public class Worker extends/*상속*/ Person/*부모 클래스*/ {
	private String company;
	private String job;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

}
