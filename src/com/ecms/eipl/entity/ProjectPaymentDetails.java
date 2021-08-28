package com.ecms.eipl.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "project_payment_details")
public class ProjectPaymentDetails {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column(name = "date")
	private Date date;

	@Column(name = "amount")
	private double amount;

	@Column(name = "client")
	private int client;

	@Column(name = "project")
	private int project;
	
	@Column(name = "payment_mode")
	private String paymentMode;

	@Column(name = "payment_details")
	private String paymentDetails;

	@Column(name = "bills")
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
