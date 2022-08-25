package com.infysim.enity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Customer")
public class Customer {

	@Id
	private String uniqueidnumber;
	private LocalDate dateofbirth;
	private String emailaddress;
	private String firstname;
	private String lastname;
	private String idtype;
	private int customeraddressAddressid;
	private int simid;
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

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
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

	public String getIdtype() {
		return idtype;
	}

	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}

	public int getCustomeraddressAddressid() {
		return customeraddressAddressid;
	}

	public void setCustomeraddressAddressid(int customeraddressAddressid) {
		this.customeraddressAddressid = customeraddressAddressid;
	}

	public int getSimid() {
		return simid;
	}

	public void setSimid(int simid) {
		this.simid = simid;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
