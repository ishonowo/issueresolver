package com.shonowo.resolver.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class VendorTerminals {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	private String vendor;
	private String terminalID;
	private String ATM_name;
	private String branch_name;
	private String region;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getTerminalID() {
		return terminalID;
	}
	public void setTerminalID(String terminalID) {
		this.terminalID = terminalID;
	}
	public String getATM_name() {
		return ATM_name;
	}
	public void setATM_name(String aTM_name) {
		ATM_name = aTM_name;
	}
	public String getBranch_name() {
		return branch_name;
	}
	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	public VendorTerminals(int id, String vendor, String terminalID, String aTM_name, String branch_name,
			String region) {
		super();
		this.vendor = vendor;
		this.terminalID = terminalID;
		ATM_name = aTM_name;
		this.branch_name = branch_name;
		this.region = region;
	}
	
	public VendorTerminals() {
		super();
	}
	@Override
	public String toString() {
		return "VendorTerminals [id=" + id + ", vendor=" + vendor + ", terminalID=" + terminalID + ", ATM_name="
				+ ATM_name + ", branch_name=" + branch_name + ", region=" + region + "]";
	}
	
	
	

}
