package com.infysim.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.infysim.dto.SimDetailsDTO;
import com.infysim.dto.SimOffersDTO;
import com.infysim.enity.SimDetails;
import com.infysim.enity.SimOffers;
import com.infysim.exceptions.SimNotFoundException;
import com.infysim.repository.SimDetailsRepository;
import com.infysim.repository.SimOffersRepository;
import com.infysim.util.InfySimConstants;

@Service
public class SimService {
	@Autowired
	private SimDetailsRepository simRepository;
	@Autowired
	private SimOffersRepository simOffersRepository;
	@Autowired
	private Environment environment;

	public String fetchDetails(SimDetailsDTO sdto) throws SimNotFoundException {
		System.out.println(sdto.getServiceNumber());
		SimDetails simDetails = simRepository.findBySimnumberAndServicenumber(sdto.getSimNumber(),
				sdto.getServiceNumber());
		SimOffers simOffers = null;

		if (simDetails != null) {
			if ("active".equals(simDetails.getSimstatus())) {
				return "SIM is already Active";
			}

			simOffers = simOffersRepository.findBySimid(simDetails.getSimid());

			SimOffersDTO sodto = new SimOffersDTO();
			sodto.setCallQty(simOffers.getCallqty());
			sodto.setCost(simOffers.getCost());
			sodto.setDataQty(simOffers.getDataqty());
			sodto.setDuration(simOffers.getDuration());
			sodto.setOfferName(simOffers.getOffername());

			return sodto.toString();
		} else {
//			throw new SimNotFoundException(environment.getProperty(InfySimConstants.SIM_NOT_FOUND.toString()));
			throw new SimNotFoundException("Invalid details, please check again SIM number/Service number!");
		}
	}

}
