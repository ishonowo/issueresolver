package com.shonowo.resolver.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BranchAddresses {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	private String solId;
	private String branchEmail;
	private String physicalAddress;
	private String branchName;
	
	
	@Override
	public String toString() {
		return "BranchAddresses [id=" + id + ", solId=" + solId + ", branchEmail=" + branchEmail + ", physicalAddress="
				+ physicalAddress + ", branchName="+branchName+ "]";
	}

	public BranchAddresses() {
		super();
	}

	public BranchAddresses(int id, String solId, String branchEmail, String physicalAddress, String branchName) {
		super();
		this.solId = solId;
		this.branchEmail = branchEmail;
		this.physicalAddress = physicalAddress;
		this.branchName = branchName;
	}
	
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSolId() {
		return solId;
	}
	public void setSolId(String solId) {
		this.solId = solId;
	}
	public String getBranchEmail() {
		return branchEmail;
	}
	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}
	public String getPhysicalAddress() {
		return physicalAddress;
	}
	public void setPhysicalAddress(String physicalAddress) {
		this.physicalAddress = physicalAddress;
	}
	
	
}
