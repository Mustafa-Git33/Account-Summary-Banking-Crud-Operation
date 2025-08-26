package com.AccountSummary.spring.boot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Customer {
	
	public String getCustomerId() {
		return customerId;
	}


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}


	public String getCif() {
		return cif;
	}


	public void setCif(String cif) {
		this.cif = cif;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getPan() {
		return pan;
	}


	public void setPan(String pan) {
		this.pan = pan;
	}


	public String getAadhaar() {
		return aadhaar;
	}


	public void setAadhaar(String aadhaar) {
		this.aadhaar = aadhaar;
	}


	public String getKycStatus() {
		return kycStatus;
	}


	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}

	@Column(name = "customer_idCus")
	private String customerId;
    private String cif;
	private String fullName;
	private String dob;
	private String pan;
	private String aadhaar;
	private String kycStatus;
	private String email;
	private String mobile;
	
	
	@Embedded
	private Address address;
	
	
	

}
