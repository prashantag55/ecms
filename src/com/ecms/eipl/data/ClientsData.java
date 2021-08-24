package com.ecms.eipl.data;

import java.util.List;

public class ClientsData {

	private int clientId;

	private String clientName;

	private String gstNumber;

	private String address;

	private String websiteLink;

	private String primaryEmailId;

	private String otherEmailId;

	private String remarks;
	private List<ContactDetailsData> contactDetailsDataList;
	
	private List<ProjectData> projectDataList;
	
	private List<PaymentDetailsData> paymentDetailsDataList;

	public List<ProjectData> getProjectDataList() {
		return projectDataList;
	}

	public void setProjectDataList(List<ProjectData> projectDataList) {
		this.projectDataList = projectDataList;
	}

	public List<PaymentDetailsData> getPaymentDetailsDataList() {
		return paymentDetailsDataList;
	}

	public void setPaymentDetailsDataList(List<PaymentDetailsData> paymentDetailsDataList) {
		this.paymentDetailsDataList = paymentDetailsDataList;
	}

	public List<ContactDetailsData> getContactDetailsDataList() {
		return contactDetailsDataList;
	}

	public void setContactDetailsDataList(List<ContactDetailsData> contactDetailsDataList) {
		this.contactDetailsDataList = contactDetailsDataList;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsiteLink() {
		return websiteLink;
	}

	public void setWebsiteLink(String websiteLink) {
		this.websiteLink = websiteLink;
	}

	public String getPrimaryEmailId() {
		return primaryEmailId;
	}

	public void setPrimaryEmailId(String primaryEmailId) {
		this.primaryEmailId = primaryEmailId;
	}

	public String getOtherEmailId() {
		return otherEmailId;
	}

	public void setOtherEmailId(String otherEmailId) {
		this.otherEmailId = otherEmailId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
