package com.ecms.eipl.data;

import java.util.Date;
import java.util.List;

public class ProjectData {

	private int projectId;

	private String workOrderStatus;

	private Date projectDate;

	private String projectName;

	private String scope;
	private double agreedFees;
	private int client;
	private String projectLocation;
	private String constructionType;
	private String projectStatus;
	private String projectSize;
	private double tenderValue;

	private List<BillsData> billsDataList;

	private List<ProjectAssociatePaymentData> projectAssociatePaymentDataList;

	private List<ProjectServicesData> projectServicesDataList;

	private List<ProjectPaymentDetailsData> projectPaymentDetailsDataList;

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

	public List<BillsData> getBillsDataList() {
		return billsDataList;
	}

	public List<ProjectAssociatePaymentData> getProjectAssociatePaymentDataList() {
		return projectAssociatePaymentDataList;
	}

	public List<ProjectPaymentDetailsData> getProjectPaymentDetailsDataList() {
		return projectPaymentDetailsDataList;
	}

	public void setBillsDataList(List<BillsData> billsDataList) {
		this.billsDataList = billsDataList;
	}

	public void setProjectAssociatePaymentDataList(List<ProjectAssociatePaymentData> projectAssociatePaymentDataList) {
		this.projectAssociatePaymentDataList = projectAssociatePaymentDataList;
	}

	public void setProjectPaymentDetailsDataList(List<ProjectPaymentDetailsData> projectPaymentDetailsDataList) {
		this.projectPaymentDetailsDataList = projectPaymentDetailsDataList;
	}

	public List<ProjectServicesData> getProjectServicesDataList() {
		return projectServicesDataList;
	}

	public void setProjectServicesDataList(List<ProjectServicesData> projectServicesDataList) {
		this.projectServicesDataList = projectServicesDataList;
	}
	
	

}
