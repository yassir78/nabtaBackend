package com.oracle.model;

import java.util.List;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Disease {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nom;
	private String nomScientifique;
	private String symptoms;
	private String cycleImage;
	private String conditions;
	private String management;
	private String control;
	@OneToMany(mappedBy = "disease")
	private List<Image> images;
	private String langue;

}
