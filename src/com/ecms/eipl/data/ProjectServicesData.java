package com.ecms.eipl.data;

public class ProjectServicesData {


	private int id;

	
	private int project;

	
	private String service;

	
	private double fees;

	
	private int associate;

	public int getId() {
		return id;
	}

	public int getProject() {
		return project;
	}

	public String getService() {
		return service;
	}

	public double getFees() {
		return fees;
	}

	public int getAssociate() {
		return associate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProject(int project) {
		this.project = project;
	}

	public void setService(String service) {
		this.service = service;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public void setAssociate(int associate) {
		this.associate = associate;
	}
}
