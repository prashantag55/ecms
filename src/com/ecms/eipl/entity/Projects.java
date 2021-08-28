package com.ecms.eipl.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Projects")
public class Projects {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Project_id")
	private int projectId;

	@Column(name = "work_order_status")
	private String workOrderStatus;

	@Column(name = "project_date")
	private Date projectDate;

	@Column(name = "project_name")
	private String projectName;

	@Column(name = "scope")
	private String scope;
	@Column(name = "agreed_fees")
	private double agreedFees;
	@Column(name = "client")
	private int client;
	@Column(name = "project_location")
	private String projectLocation;
	@Column(name = "construction_type")
	private String constructionType;
	@Column(name = "project_status")
	private String projectStatus;
	@Column(name = "project_size")
	private String projectSize;
	@Column(name = "tender_value")
	private double tenderValue;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getWorkOrderStatus() {
		return workOrderStatus;
	}

	public void setWorkOrderStatus(String workOrderStatus) {
		this.workOrderStatus = workOrderStatus;
	}

	public Date getProjectDate() {
		return projectDate;
	}

	public void setProjectDate(Date projectDate) {
		this.projectDate = projectDate;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public double getAgreedFees() {
		return agreedFees;
	}

	public void setAgreedFees(double agreedFees) {
		this.agreedFees = agreedFees;
	}

	public int getClient() {
		return client;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public String getProjectLocation() {
		return projectLocation;
	}

	public void setProjectLocation(String projectLocation) {
		this.projectLocation = projectLocation;
	}

	public String getConstructionType() {
		return constructionType;
	}

	public void setConstructionType(String constructionType) {
		this.constructionType = constructionType;
	}

	public String getProjectStatus() {
		return projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getProjectSize() {
		return projectSize;
	}

	public void setProjectSize(String projectSize) {
		this.projectSize = projectSize;
	}

	public double getTenderValue() {
		return tenderValue;
	}

	public void setTenderValue(double tenderValue) {
		this.tenderValue = tenderValue;
	}

}
