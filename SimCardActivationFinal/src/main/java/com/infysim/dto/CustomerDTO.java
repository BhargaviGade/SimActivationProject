package com.infysim.dto;

import java.time.LocalDate;

import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomerDTO {

	@Pattern(regexp = "[0-9]{16}", message = "{customer.uniqueidnumber.invalid}")
	private String uniqueIdNumber;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent(message = "{customer.datofbirth.invalid}")
	private LocalDate dateOfBirth;
	private String emailAddress;
	private String firstName;
	private String lastName;
	private String idType;
	private int customerAddress_AddressId;
	private int simId;
	private String state;

	public String getUniqueIdNumber() {
		return uniqueIdNumber;
	}

	public void setUniqueIdNumber(String uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public int getCustomerAddress_AddressId() {
		return customerAddress_AddressId;
	}

	public void setCustomerAddress_AddressId(int customerAddress_AddressId) {
		this.customerAddress_AddressId = customerAddress_AddressId;
	}

	public int getSimId() {
		return simId;
	}

	public void setSimId(int simId) {
		this.simId = simId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public CustomerDTO(
			@Pattern(regexp = "[0-9]{16}", message = "{customer.uniqueidnumber.invalid}") String uniqueIdNumber,
			@PastOrPresent(message = "{customer.datofbirth.invalid}") LocalDate dateOfBirth, String emailAddress,
			String firstName, String lastName, String idType, int customerAddress_AddressId, int simId, String state) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAddress;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idType = idType;
		this.customerAddress_AddressId = customerAddress_AddressId;
		this.simId = simId;
		this.state = state;
	}

	public CustomerDTO() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerDTO [uniqueIdNumber=" + uniqueIdNumber + ", dateOfBirth=" + dateOfBirth + ", emailAddress="
				+ emailAddress + ", firstName=" + firstName + ", lastName=" + lastName + ", idType=" + idType
				+ ", customerAddress_AddressId=" + customerAddress_AddressId + ", simId=" + simId + ", state=" + state
				+ "]";
	}
	
	
	
	

}
