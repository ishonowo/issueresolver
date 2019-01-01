package com.shonowo.resolver.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class VendorContacts {

	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	private String vendor;
	private String contact;
	
	
	
	public VendorContacts() {
		super();
	}

	public VendorContacts(int id, String vendor, String contact) {
		super();
		this.vendor = vendor;
		this.contact = contact;
	}
	
	@Override
	public String toString() {
		return "VendorContacts [id=" + id + ", vendor=" + vendor + ", contact=" + contact + "]";
	}
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	

}
