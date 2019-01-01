package com.shonowo.resolver.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Issue {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long issueId;
	private String terminalId;
	private String issueDesc;
	private String logger;
	private String loggerEmail;
	private String loggerPhoneNo;
	private Date logDate;
	private String supportEmail;
	private String contact;
	private String branchEmail;
	private String branchName;
	private String atmName;
	private String physical_address;
	private String vendor;
	
	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", terminalId=" + terminalId + ", issueDesc=" + issueDesc + ", logger="
				+ logger + ", loggerEmail=" + loggerEmail + ", loggerPhoneNo=" + loggerPhoneNo + ", logDate=" + logDate
				+ ", supportEmail=" + supportEmail + ", contact=" + contact + ", branchEmail=" + branchEmail
				+ ", branchName=" + branchName + ", atmName=" + atmName + ", physical_address=" + physical_address
				+ ", vendor=" + vendor + "]";
	}

	public Issue() {
		
	}

	public Issue(String terminalId, String issueDesc, String logger, String loggerEmail, String loggerPhoneNo, Date logDate,
			String supportEmail, String contact, String branchEmail, String branchName, String atmName,
			String physical_address, String vendor) {
		this.terminalId = terminalId;
		this.issueDesc = issueDesc;
		this.logger = logger;
		this.loggerEmail = loggerEmail;
		this.loggerPhoneNo = loggerPhoneNo;
		this.logDate = logDate;
		this.supportEmail = supportEmail;
		this.contact = contact;
		this.branchEmail = branchEmail;
		this.branchName = branchName;
		this.atmName = atmName;
		this.physical_address = physical_address;
		this.vendor = vendor;
	}



	public Long getIssueId() {
		return issueId;
	}

	public void setIssueId(Long issueId) {
		this.issueId = issueId;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getIssueDesc() {
		return issueDesc;
	}

	public void setIssueDesc(String issueDesc) {
		this.issueDesc = issueDesc;
	}

	public String getLogger() {
		return logger;
	}

	public void setLogger(String logger) {
		this.logger = logger;
	}

	public String getLoggerEmail() {
		return loggerEmail;
	}

	public void setLoggerEmail(String loggerEmail) {
		this.loggerEmail = loggerEmail;
	}

	public String getLoggerPhoneNo() {
		return loggerPhoneNo;
	}

	public void setLoggerPhoneNo(String loggerPhoneNo) {
		this.loggerPhoneNo = loggerPhoneNo;
	}

	public Date getLogDate() {
		return logDate;
	}

	public void setLogDate(Date logDate) {
		this.logDate = logDate;
	}

	public String getSupportEmail() {
		return supportEmail;
	}

	public void setSupportEmail(String supportEmail) {
		this.supportEmail = supportEmail;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getBranchEmail() {
		return branchEmail;
	}

	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getAtmName() {
		return atmName;
	}

	public void setAtmName(String atmName) {
		this.atmName = atmName;
	}

	public String getPhysical_address() {
		return physical_address;
	}

	public void setPhysical_address(String physical_address) {
		this.physical_address = physical_address;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	
	
}
