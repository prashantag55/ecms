package com.ecms.eipl.data;

import java.sql.Date;

public class BillsData {

	private String invoiceNumber;

	private Date date;

	private double fees;

	private int client;

	private int project;

	private double cgst;

	private double sgst;

	private double igst;

	private double tds;

	private String billPath;

	private String paymentMode;

	private String paymentDetails;

	private boolean tdsPaid;

	private String billType;

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
