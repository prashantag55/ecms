package com.ecms.eipl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Project_Services")
public class ProjectServices {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private int id;

	@Column(name = "project")
	private int project;

	@Column(name = "service")
	private String service;

	@Column(name = "fees")
	private double fees;

	@Column(name = "associate")
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
