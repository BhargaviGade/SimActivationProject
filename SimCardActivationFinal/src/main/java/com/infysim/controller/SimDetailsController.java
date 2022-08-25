package com.infysim.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infysim.dto.SimDetailsDTO;
import com.infysim.exceptions.SimNotFoundException;
import com.infysim.services.SimService;

@RestController
@RequestMapping("/simdetails")
public class SimDetailsController {
	@Autowired
	private SimService simServices;

	@PostMapping
	public ResponseEntity<String> getSimDetails(@Valid @RequestBody SimDetailsDTO sdto) {

		String response;
		try {
			response = simServices.fetchDetails(sdto);
		} catch (SimNotFoundException e) {
			response = e.getMessage();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
}
