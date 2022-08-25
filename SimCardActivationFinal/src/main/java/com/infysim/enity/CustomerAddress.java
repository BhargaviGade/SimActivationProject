package com.infysim.enity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Customeraddress")
public class CustomerAddress {
	@Id
	private int addressid;
	private String address;
	private String city;
	private String pincode;
	private String state;

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public CustomerAddress(int addressid, String address, String city, String pincode, String state) {
		super();
		this.addressid = addressid;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public CustomerAddress() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerAddress [addressid=" + addressid + ", address=" + address + ", city=" + city + ", pincode="
				+ pincode + ", state=" + state + "]";
	}

}
