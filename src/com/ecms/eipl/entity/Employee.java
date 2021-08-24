package com.ecms.eipl.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = -723583058586873472L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Emp_id")
	private int empId;

	@Column(name = "name")
	private String name;

	@Column(name = "joining_date")
	private Date joiningDate;

	@Column(name = "designation")
	private String designation;

	@Column(name = "monthly_salary")
	private double monthlySalary;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile_number")
	private int mobileNumber;

	@Column(name = "last_date")
	private Date lastDate;

	@Column(name = "current_address")
	private String currentAddress;

	@Column(name = "permanent_address")
	private String permanentAddress;

	@Column(name = "em_mobile_number")
	private int emMobileNumber;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public int getEmMobileNumber() {
		return emMobileNumber;
	}

	public void setEmMobileNumber(int emMobileNumber) {
		this.emMobileNumber = emMobileNumber;
	}

}
