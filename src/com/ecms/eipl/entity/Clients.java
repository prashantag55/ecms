package com.ecms.eipl.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author prashant.e.agarwal
 *
 */
@Entity
@Table(name = "Clients")
public class Clients implements Serializable

{
	private static final long serialVersionUID = -723583058586873489L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "client_id")
	private int clientId;

	@Column(name = "client_name")
	private String clientName;

	@Column(name = "GST_number")
	private String gstNumber;

	@Column(name = "address")
	private String address;

	@Column(name = "website_link")
	private String websiteLink;

	@Column(name = "primary_emailId")
	private String primaryEmailId;

	@Column(name = "other_emailId")
	private String otherEmailId;

	@Column(name = "remarks")
	private String remarks;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)

	@JoinColumn(name = "client")
	private List<ContactPerson> contactPerson;

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(String gstNumber) {
		this.gstNumber = gstNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWebsiteLink() {
		return websiteLink;
	}

	public void setWebsiteLink(String websiteLink) {
		this.websiteLink = websiteLink;
	}

	public String getPrimaryEmailId() {
		return primaryEmailId;
	}

	public void setPrimaryEmailId(String primaryEmailId) {
		this.primaryEmailId = primaryEmailId;
	}

	public String getOtherEmailId() {
		return otherEmailId;
	}

	public void setOtherEmailId(String otherEmailId) {
		this.otherEmailId = otherEmailId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<ContactPerson> getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(List<ContactPerson> contactPerson) {
		this.contactPerson = contactPerson;
	}

}
