package com.infysim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infysim.enity.CustomerAddress;

@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddress, Long> {
	public CustomerAddress findByAddressid(int addressId);

	@Query("Select max(ca.addressid) from Customeraddress ca")
	public int getMaxAddressid();
}
