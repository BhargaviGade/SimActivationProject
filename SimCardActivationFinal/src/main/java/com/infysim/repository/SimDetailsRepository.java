package com.infysim.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import com.infysim.enity.SimDetails;;

public interface SimDetailsRepository extends JpaRepository<SimDetails, Long> {
	SimDetails findBySimnumberAndServicenumber(String simNumber, String ServiceNumber);

	SimDetails findBySimid(int simId);
}
