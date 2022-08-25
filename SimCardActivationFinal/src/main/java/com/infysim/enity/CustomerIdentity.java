package com.infysim.enity;

import javax.persistence.Entity;
import javax.persistence.Id;

import java.time.LocalDate;

@Entity(name = "CUSTOMERIDENTITY")
public class CustomerIdentity {

	@Id
	private String uniqueidnumber;
	private LocalDate dateofbirth;
	private String firstname;
	private String lastname;
	private String emailaddress;
	private String state;

	public String getUniqueidnumber() {
		return uniqueidnumber;
	}

	public void setUniqueidnumber(String uniqueidnumber) {
		this.uniqueidnumber = uniqueidnumber;
	}

	public LocalDate getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
