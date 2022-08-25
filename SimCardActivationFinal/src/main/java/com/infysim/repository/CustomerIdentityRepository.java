package com.infysim.repository;

import java.time.LocalDate;
import org.springframework.data.jpa.repository.JpaRepository;
import com.infysim.enity.CustomerIdentity;

public interface CustomerIdentityRepository extends JpaRepository<CustomerIdentity, Long> {
	CustomerIdentity findByDateofbirthAndEmailaddress(LocalDate dateOfBirth, String emailAddress);

	CustomerIdentity findByFirstnameAndLastname(String firstName, String lastName);

	CustomerIdentity findByUniqueidnumberAndFirstnameAndLastname(String uid, String fname, String lname);

	CustomerIdentity findByDateofbirth(LocalDate dob);
}
