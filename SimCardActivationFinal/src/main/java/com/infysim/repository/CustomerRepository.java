package com.infysim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.infysim.enity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
	@Query("SELECT c.customeraddressAddressid from Customer c where c.uniqueidnumber=?1")
	public int fetchAddressid(String b);

	public Customer findByUniqueidnumber(String uniqueid);

	public Customer findByUniqueidnumberAndFirstnameAndLastname(String uid, String fname, String lname);
}
