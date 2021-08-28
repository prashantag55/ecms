package com.ecms.eipl.data;

import java.sql.Date;

public class ProjectAssociatePaymentData {
	
	
	private int id;
	
	private Date date;

	private double fees;

	private int associate;

	private int project;

	private double gst;

	private double tds;

	private String paymentMode;

	private String paymentDetails;

	private String status;

	public int getId() {
		return id;
	}

	public Date getDate() {
		return date;
	}

	public double getFees() {
		return fees;
	}

	public int getAssociate() {
		return associate;
	}

	public int getProject() {
		return project;
	}

	public double getGst() {
		return gst;
	}

	public double getTds() {
		return tds;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public String getStatus() {
		return status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public void setAssociate(int associate) {
		this.associate = associate;
	}

	public void setProject(int project) {
		this.project = project;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public void setTds(double tds) {
		this.tds = tds;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
