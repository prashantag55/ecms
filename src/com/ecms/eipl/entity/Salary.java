package com.ecms.eipl.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Salary {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "salary_id")
	private int salaryId;

	@Column(name = "emp_id")
	private int empId;

	@Column(name = "date")
	private Date date;

	@Column(name = "amount_total")
	private String amountTotal;

	@Column(name = "amount_paid")
	private double amountPaid;

	@Column(name = "salary_slip")
	private String salarySlip;

	@Column(name = "OT_days")
	private int otDays;

	@Column(name = "OT_hour")
	private int otHour;

	@Column(name = "OT_min")
	private int otMin;

	public int getSalaryId() {
		return salaryId;
	}

	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAmountTotal() {
		return amountTotal;
	}

	public void setAmountTotal(String amountTotal) {
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

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
