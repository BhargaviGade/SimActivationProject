package com.infysim.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomerIdentityDTO {

	private String uniqueIdNumber;

//	@NotNull(message="Date of Birth cannot be null")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@PastOrPresent(message = "{customer.datofbirth.invalid}")
	private LocalDate dateOfBirth;

	@NotBlank(message = "{customer.email.null}")
	@Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", message = "{customer.emailaddress.invalid}")
	private String emailAddress;
	private String state;

	@Pattern(regexp = "[a-zA-Z]+", message = "{customer.firstname.invalid}")
	@Size(max = 15, message = "{customer.firstname.maxsize}")
	private String firstName;

	@Pattern(regexp = "[a-zA-Z]+", message = "{customer.lastname.invalid}")
	@Size(max = 15, message = "{customer.lastname.maxsize}")
	private String lastName;

	public String getUniqueIdNumber() {
		return uniqueIdNumber;
	}

	public void setUniqueIdNumber(String uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	@Override
	public String toString() {
		return "CustomerIdentityDTO [uniqueIdNumber=" + uniqueIdNumber + ", dateOfBirth=" + dateOfBirth
				+ ", emailAddress=" + emailAddress + ", state=" + state + ", firstName=" + firstName + ", lastName="
				+ lastName + "]";
	}

	public CustomerIdentityDTO(String uniqueIdNumber,
			@PastOrPresent(message = "{customer.datofbirth.invalid}") LocalDate dateOfBirth,
			@NotBlank(message = "{customer.email.null}") @Pattern(regexp = "[a-z0-9]+@[a-z]+\\.[a-z]{2,3}", message = "{customer.emailaddress.invalid}") String emailAddress,
			String state,
			@Pattern(regexp = "[a-zA-Z]+", message = "{customer.firstname.invalid}") @Size(max = 15, message = "{customer.firstname.maxsize}") String firstName,
			@Pattern(regexp = "[a-zA-Z]+", message = "{customer.lastname.invalid}") @Size(max = 15, message = "{customer.lastname.maxsize}") String lastName) {
		super();
		this.uniqueIdNumber = uniqueIdNumber;
		this.dateOfBirth = dateOfBirth;
		this.emailAddress = emailAddress;
		this.state = state;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public CustomerIdentityDTO() {
		super();
	}
	
	
	

}
