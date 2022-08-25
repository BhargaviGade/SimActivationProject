package com.infysim.dto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerAddressDTO {

	@Size(max = 25, message = "{customer.address.maxsize}")
	private String address;

	@Pattern(regexp = "[a-zA-Z\s]+", message = "{customer.city.invalid}")
	private String city;

	@Pattern(regexp = "[0-9]{6}", message = "{customer.pin.invalid}")
	private String pincode;

	@Pattern(regexp = "[a-zA-Z\s]+", message = "{customer.sate.invalid}")
	private String state;

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

	public CustomerAddressDTO(@Size(max = 25, message = "{customer.address.maxsize}") String address,
			@Pattern(regexp = "[a-zA-Z ]+", message = "{customer.city.invalid}") String city,
			@Pattern(regexp = "[0-9]{6}", message = "{customer.pin.invalid}") String pincode,
			@Pattern(regexp = "[a-zA-Z ]+", message = "{customer.sate.invalid}") String state) {
		super();
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.state = state;
	}

	public CustomerAddressDTO() {
		super();
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

	@Override
	public String toString() {
		return "CustomerAddressDTO [address=" + address + ", city=" + city + ", pincode=" + pincode + ", state=" + state
				+ "]";
	}

}
