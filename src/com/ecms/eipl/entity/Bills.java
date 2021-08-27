package com.ecms.eipl.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Bills")
public class Bills {

	@Id
	@Column(name = "invoice_number")
	private String invoiceNumber;

	@Column(name = "date")
	private Date date;

	@Column(name = "fees")
	private double fees;

	@Column(name = "client")
	private int client;

	@Column(name = "project")
	private int project;

	@Column(name = "CGST")
	private double cgst;

	@Column(name = "SGST")
	private double sgst;

	@Column(name = "IGST")
	private double igst;

	@Column(name = "TDS")
	private double tds;

	@Column(name = "bill_path")
	private String billPath;

	@Column(name = "payment_mode")
	private String paymentMode;

	@Column(name = "payment_details")
	private String paymentDetails;

	@Column(name = "tds_paid")
	private boolean tdsPaid;

	@Column(name = "bill_type")
	private String billType;

	@Column(name = "status")
	private String status;

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public Date getDate() {
		return date;
	}

	public double getFees() {
		return fees;
	}

	public int getClient() {
		return client;
	}

	public int getProject() {
		return project;
	}

	public double getCgst() {
		return cgst;
	}

	public double getSgst() {
		return sgst;
	}

	public double getIgst() {
		return igst;
	}

	public double getTds() {
		return tds;
	}

	public String getBillPath() {
		return billPath;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public boolean isTdsPaid() {
		return tdsPaid;
	}

	public String getBillType() {
		return billType;
	}

	public String getStatus() {
		return status;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public void setClient(int client) {
		this.client = client;
	}

	public void setProject(int project) {
		this.project = project;
	}

	public void setCgst(double cgst) {
		this.cgst = cgst;
	}

	public void setSgst(double sgst) {
		this.sgst = sgst;
	}

	public void setIgst(double igst) {
		this.igst = igst;
	}

	public void setTds(double tds) {
		this.tds = tds;
	}

	public void setBillPath(String billPath) {
		this.billPath = billPath;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public void setTdsPaid(boolean tdsPaid) {
		this.tdsPaid = tdsPaid;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
