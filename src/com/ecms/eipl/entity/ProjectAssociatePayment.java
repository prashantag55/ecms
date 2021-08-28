package com.ecms.eipl.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "associate_payment")
public class ProjectAssociatePayment {
	
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(name = "date")
	private Date date;

	@Column(name = "fees")
	private double fees;

	@Column(name = "associate")
	private int associate;

	@Column(name = "project")
	private int project;

	@Column(name = "GST")
	private double gst;

	@Column(name = "TDS")
	private double tds;

	@Column(name = "payment_mode")
	private String paymentMode;

	@Column(name = "payment_details")
	private String paymentDetails;

	@Column(name = "status")
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
