package com.infysim.dto;

import javax.validation.constraints.Pattern;

public class SimDetailsDTO {

	@Pattern(regexp = "[0-9]{13}", message = "{sim.simnumber.invalid}")
	private String simNumber;

	@Pattern(regexp = "[0-9]{10}", message = "{sim.servicenumber.invalid}")
	private String serviceNumber;

	public String getSimNumber() {
		return simNumber;
	}

	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}

	public String getServiceNumber() {
		return serviceNumber;
	}

	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}

	@Override
	public String toString() {
		return "SimDTO [simNumber=" + simNumber + ", serviceNumber=" + serviceNumber + "]";
	}

	public SimDetailsDTO(@Pattern(regexp = "[0-9]{13}", message = "sim.simnumber.invalid") String simNumber,
			@Pattern(regexp = "[0-9]{10}", message = "sim.servicenumber.invalid") String serviceNumber) {
		super();
		this.simNumber = simNumber;
		this.serviceNumber = serviceNumber;
	}

	public SimDetailsDTO() {
		super();
	}

	
	
	
}
