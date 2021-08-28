package com.ecms.eipl.data;

import java.sql.Date;

public class ProjectPaymentDetailsData {

	private String id;

	private Date date;

	private double amount;

	private int client;

	private int project;

	private String paymentMode;

	private String paymentDetails;

	private int bills;

	public String getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	public int getClient() {
		return client;
	}

	public int getProject() {
		return project;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public int getBills() {
		return bills;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public void setProject(int project) {
		this.project = project;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public void setBills(int bills) {
		this.bills = bills;
	}

}
