package com.infysim.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infysim.dto.CustomerDTO;
import com.infysim.exceptions.CustomerNotFoundException;
import com.infysim.services.CustomerService;

@RestController
@RequestMapping("idvalidation")
public class CustomerIdProofController {
	@Autowired
	CustomerService customerService;

	@PostMapping
	public ResponseEntity<String> idProofValidation(@Valid @RequestBody CustomerDTO cdto) {

		String response;

		try {
			response = customerService.validateIdProof(cdto);
		} catch (CustomerNotFoundException e) {
			response = e.getMessage();
		}

		return ResponseEntity.ok(response);
	}
}
