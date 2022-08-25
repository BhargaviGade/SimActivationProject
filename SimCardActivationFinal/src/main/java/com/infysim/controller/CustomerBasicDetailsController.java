package com.infysim.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infysim.dto.CustomerIdentityDTO;
import com.infysim.services.CustomerService;

@RestController
@RequestMapping("basicdetails")
public class CustomerBasicDetailsController {
	@Autowired
	CustomerService customerService;

	@PostMapping
	public ResponseEntity<String> verifyBasicDetails(@Valid @RequestBody CustomerIdentityDTO cidto) {
		String response;
		try {
			response = customerService.checkBasicDetails(cidto);
		} catch (Exception e) {
			response = e.getMessage();
		}

		return ResponseEntity.ok(response);
	}
}