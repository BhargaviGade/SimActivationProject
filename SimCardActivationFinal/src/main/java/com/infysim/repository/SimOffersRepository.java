package com.infysim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infysim.enity.SimOffers;

public interface SimOffersRepository extends JpaRepository<SimOffers, Long> {
	SimOffers findBySimid(int simId);
}
