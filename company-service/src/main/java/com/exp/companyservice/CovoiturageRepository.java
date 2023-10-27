package com.exp.companyservice;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface CovoiturageRepository extends JpaRepository<Covoiturage, Long> {


}