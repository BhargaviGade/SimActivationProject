package com.infysim.enity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "SIMOFFERS")
public class SimOffers {

	@Id
	private int offerid;
	private int callqty;
	private int cost;
	private int dataqty;
	private int duration;
	private String offername;
	private int simid;

	public int getOfferid() {
		return offerid;
	}

	public void setOfferid(int offerid) {
		this.offerid = offerid;
	}

	public int getCallqty() {
		return callqty;
	}

	public void setCallqty(int callqty) {
		this.callqty = callqty;
	}

	public int getDataqty() {
		return dataqty;
	}

	public void setDataqty(int dataqty) {
		this.dataqty = dataqty;
	}

	public String getOffername() {
		return offername;
	}

	public void setOffername(String offername) {
		this.offername = offername;
	}

	public int getSimid() {
		return simid;
	}

	public void setSimid(int simid) {
		this.simid = simid;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "SimOffers [offerid=" + offerid + ", callqty=" + callqty + ", cost=" + cost + ", dataqty=" + dataqty
				+ ", duration=" + duration + ", offername=" + offername + ", simid=" + simid + "]";
	}

}
