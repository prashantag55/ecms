package com.ecms.eipl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "associates")
public class Associates {

	@Id
	@Column(name = "associate_id")
	private int associateId;

	@Column(name = "associate_name")
	private String associateName;

	@Column(name = "mobile_number")
	private int mobileNumber;

	@Column(name = "email")
	private String email;

	public int getAssociateId() {
		return associateId;
	}

	public String getAssociateName() {
		return associateName;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setAssociateId(int associateId) {
		this.associateId = associateId;
	}

	public void setAssociateName(String associateName) {
		this.associateName = associateName;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
