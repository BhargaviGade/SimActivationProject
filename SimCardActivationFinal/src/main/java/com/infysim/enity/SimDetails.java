package com.infysim.enity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "SIMDETAILS")
public class SimDetails {
	@Id
	private int simid;
	private String simnumber;
	private String servicenumber;
	private String simstatus;

	public int getSimid() {
		return simid;
	}

	public void setSimid(int simid) {
		this.simid = simid;
	}

	public String getSimnumber() {
		return simnumber;
	}

	public void setSimnumber(String simnumber) {
		this.simnumber = simnumber;
	}

	public String getServicenumber() {
		return servicenumber;
	}

	public void setServicenumber(String servicenumber) {
		this.servicenumber = servicenumber;
	}

	public String getSimstatus() {
		return simstatus;
	}

	public void setSimstatus(String simstatus) {
		this.simstatus = simstatus;
	}

	@Override
	public String toString() {
		return "SimDetails [simid=" + simid + ", simnumber=" + simnumber + ", servicenumber=" + servicenumber
				+ ", simstatus=" + simstatus + "]";
	}

}
