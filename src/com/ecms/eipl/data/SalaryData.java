package com.ecms.eipl.data;

import java.sql.Date;

public class SalaryData {

	private int salaryId;

	private int empId;

	private Date date;

	private double amountTotal;

	private double amountPaid;

	private String salarySlip;

	private int otDays;

	private int otHour;

	private int otMin;

	public int getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getAmountTotal() {
		return amountTotal;
	}

	public void setAmountTotal(double amountTotal) {
		this.amountTotal = amountTotal;
	}

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public String getSalarySlip() {
		return salarySlip;
	}

	public void setSalarySlip(String salarySlip) {
		this.salarySlip = salarySlip;
	}

	public int getOtDays() {
		return otDays;
	}

	public void setOtDays(int otDays) {
		this.otDays = otDays;
	}

	public int getOtHour() {
		return otHour;
	}

	public void setOtHour(int otHour) {
		this.otHour = otHour;
	}

	public int getOtMin() {
		return otMin;
	}

	public void setOtMin(int otMin) {
		this.otMin = otMin;
	}

}
