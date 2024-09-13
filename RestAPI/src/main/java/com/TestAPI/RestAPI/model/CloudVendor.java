package com.TestAPI.RestAPI.model;

import jakarta.persistence.*;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
	
	@Id
	private int vendorId;
	private String vendorName;
	private String vendorAddress;
	private String vendorPhoneNo;
	public CloudVendor(int vendorId, String vendorName, String vendorAddress, String vendorPhoneNo) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddress = vendorAddress;
		this.vendorPhoneNo = vendorPhoneNo;
	}
	public CloudVendor() {
		super();
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddress() {
		return vendorAddress;
	}
	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}
	public String getVendorPhoneNo() {
		return vendorPhoneNo;
	}
	public void setVendorPhoneNo(String vendorPhoneNo) {
		this.vendorPhoneNo = vendorPhoneNo;
	}
	
	
	

}
