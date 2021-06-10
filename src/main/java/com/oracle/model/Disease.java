package com.oracle.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Disease {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(length = 3000)
	private String nomClasse;
	@Column(length = 3000)
	private String nom;
	@Column(length = 3000)
	private String nomScientifique;
	@Column(length = 3000)
	private String symptoms;
	@Column(length = 3000)
	private String cycleImage;
	@Column(length = 3000)
	private String conditions;
	@Column(length = 3000)
	private String management;
	@Column(length = 3000)
	private String control;
	@OneToMany(mappedBy = "disease")
	private List<Image> images;
	private String langue;

	public Disease() {
	}

	public Disease(long id, String nomClasse, String nom, String nomScientifique, String symptoms, String cycleImage, String conditions,
			String management, String control, List<Image> images, String langue) {
		this.id = id;
		this.nomClasse = nomClasse;
		this.nom = nom;
		this.nomScientifique = nomScientifique;
		this.symptoms = symptoms;
		this.cycleImage = cycleImage;
		this.conditions = conditions;
		this.management = management;
		this.control = control;
		this.images = images;
		this.langue = langue;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomClasse() {
		return nomClasse;
	}

	public void setNomClasse(String nomClasse) {
		this.nomClasse = nomClasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomScientifique() {
		return nomScientifique;
	}

	public void setNomScientifique(String nomScientifique) {
		this.nomScientifique = nomScientifique;
	}

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public String getCycleImage() {
		return cycleImage;
	}

	public void setCycleImage(String cycleImage) {
		this.cycleImage = cycleImage;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getManagement() {
		return management;
	}

	public void setManagement(String management) {
		this.management = management;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public String getLangue() {
		return langue;
	}

	public void setLangue(String langue) {
		this.langue = langue;
	}

	@Override
	public String toString() {
		return "Disease [id=" + id+ ", nomClasse=" + nomClasse + ", nom=" + nom + ", nomScientifique=" + nomScientifique + ", symptoms=" + symptoms
				+ ", cycleImage=" + cycleImage + ", conditions=" + conditions + ", management=" + management
				+ ", control=" + control + ", images=" + images + ", langue=" + langue + "]";
	}

}
