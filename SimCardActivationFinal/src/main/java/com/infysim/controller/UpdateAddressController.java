package com.infysim.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.infysim.dto.CustomerAddressDTO;
import com.infysim.services.CustomerService;

@RestController
@RequestMapping("updateaddress")
public class UpdateAddressController {

	@Autowired
	CustomerService customerService;

	@PutMapping(value = "/{uniqueid}")
	public ResponseEntity<String> updateAddress(@PathVariable("uniqueid") String uniqueid,
			@Valid @RequestBody CustomerAddressDTO cadto) {
		return ResponseEntity.ok(customerService.updateCustomerAddress(uniqueid, cadto));
	}
}