package com.infysim.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infysim.dto.CustomerAddressDTO;
import com.infysim.dto.CustomerDTO;
import com.infysim.dto.CustomerIdentityDTO;
import com.infysim.enity.Customer;
import com.infysim.enity.CustomerAddress;
import com.infysim.enity.CustomerIdentity;
import com.infysim.enity.SimDetails;
import com.infysim.exceptions.CustomerNotFoundException;
import com.infysim.repository.CustomerAddressRepository;
import com.infysim.repository.CustomerIdentityRepository;
import com.infysim.repository.CustomerRepository;
import com.infysim.repository.SimDetailsRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerIdentityRepository customerIdentityRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private CustomerAddressRepository customerAddressRepository;

	@Autowired
	private SimDetailsRepository simRepository;

	public String checkBasicDetails(CustomerIdentityDTO cidto) throws CustomerNotFoundException {

		CustomerIdentity customerIdentity = customerIdentityRepository
				.findByDateofbirthAndEmailaddress(cidto.getDateOfBirth(), cidto.getEmailAddress());

		if (customerIdentity != null) {
			return "Customer Basic Details Verfied Successfully";
		} else {
			throw new CustomerNotFoundException("No request placed for you.");
		}

	}

	public String checkPersonalDetails(CustomerIdentityDTO cidto) throws CustomerNotFoundException {
		CustomerIdentity customerIdentity = customerIdentityRepository.findByFirstnameAndLastname(cidto.getFirstName(),
				cidto.getLastName());
		if (customerIdentity != null) {
			if (cidto.getEmailAddress().equalsIgnoreCase(customerIdentity.getEmailaddress()))
				return "Customer Personal Details Verfied Succesfully";
			return "Invalid email details!!";
		} else {
			throw new CustomerNotFoundException("No customer found for the provided details");
		}
	}

	public String updateCustomerAddress(String uniqueid, CustomerAddressDTO cadto) {
		CustomerAddress customerAddress = new CustomerAddress();
		customerAddress.setAddress(cadto.getAddress());
		customerAddress.setCity(cadto.getCity());
		customerAddress.setPincode(cadto.getPincode());
		customerAddress.setState(cadto.getState());

		int addressId = customerRepository.fetchAddressid(uniqueid);
		CustomerAddress cadtoOld = customerAddressRepository.findByAddressid(addressId);
		if (cadtoOld != null) {
			customerAddress.setAddressid(addressId);
			customerAddressRepository.saveAndFlush(customerAddress);
		} else {
			addressId = customerAddressRepository.getMaxAddressid();
			customerAddress.setAddressid(++addressId);
			customerAddressRepository.saveAndFlush(customerAddress);
		}

		CustomerAddressDTO cadtonew = new CustomerAddressDTO();
		cadtonew.setAddress(customerAddress.getAddress());
		cadto.setCity(customerAddress.getCity());
		cadto.setPincode(customerAddress.getPincode());
		cadto.setState(customerAddress.getState());

		return "address updated successfully" + cadto.toString();
	}

	public String validateIdProof(CustomerDTO cdto) throws CustomerNotFoundException {

		String uid = cdto.getUniqueIdNumber();
		String fname = cdto.getFirstName();
		String lname = cdto.getLastName();
		LocalDate dob = cdto.getDateOfBirth();
		CustomerIdentity cid = customerIdentityRepository.findByUniqueidnumberAndFirstnameAndLastname(uid, fname,
				lname);
		Customer cust = customerRepository.findByUniqueidnumberAndFirstnameAndLastname(uid, fname, lname);

		if (cid != null && cust != null) {

			if (customerIdentityRepository.findByDateofbirth(dob) != null) {
				SimDetails sd = simRepository.findBySimid(cust.getSimid());
				sd.setSimstatus("active");
				simRepository.saveAndFlush(sd);
				return "Success, Sim is Activated";
			}
			return "Incorrect date of birth details";

		} else {
			throw new CustomerNotFoundException("Invalid details entered! Check the details and try again.");
		}
	}

}
