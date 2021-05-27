package com.oracle.service;

import java.util.List;

import com.oracle.model.Disease;

public interface DiseaseService {
	public List<Disease> findAll();

	public Disease findById(Long id);

	public Disease findByNomAndLangue(String nom,String langue);

	public Disease addDisease(Disease disease);

	public Disease update(Disease disease);
	
	public int delete(Long id);
}
