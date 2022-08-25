package com.infysim.dto;

public class SimOffersDTO {

	private int callQty;
	private int cost;
	private int dataQty;
	private int duration;
	private String offerName;
	public int getCallQty() {
		return callQty;
	}
	public void setCallQty(int callQty) {
		this.callQty = callQty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getDataQty() {
		return dataQty;
	}
	public void setDataQty(int dataQty) {
		this.dataQty = dataQty;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getOfferName() {
		return offerName;
	}
	public void setOfferName(String offerName) {
		this.offerName = offerName;
	}
	@Override
	public String toString() {
		return "SimOffersDTO [callQty=" + callQty + ", cost=" + cost + ", dataQty=" + dataQty + ", duration=" + duration
				+ ", offerName=" + offerName + "]";
	}
	public SimOffersDTO(int callQty, int cost, int dataQty, int duration, String offerName) {
		super();
		this.callQty = callQty;
		this.cost = cost;
		this.dataQty = dataQty;
		this.duration = duration;
		this.offerName = offerName;
	}
	public SimOffersDTO() {
		super();
	}
	
	
	
	
}
