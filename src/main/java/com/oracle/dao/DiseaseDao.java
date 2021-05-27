package com.oracle.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oracle.model.Disease;

@Repository
public interface DiseaseDao extends JpaRepository<Disease, Long> {
	public Disease findByNomAndLangue(String nom,String langue);
}
