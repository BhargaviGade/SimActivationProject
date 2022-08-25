package com.infysim.util;

public enum InfySimConstants {
	SIM_NOT_FOUND("sim.not.found");
	
	private final String type;

	private InfySimConstants(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.type;
	}

}
