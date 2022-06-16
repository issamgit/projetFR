package com.ib.filrouge.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.val;

@Entity
//@DiscriminatorValue(value = "RES")
public class Responsable extends Personne {

	@OneToMany(mappedBy = "responsable")
	private List<Etudiant> etudiants;
	@OneToMany(mappedBy = "responsable")
	private List<Formation> formations;
	@OneToMany(mappedBy = "responsable")
	private List<Formateur> formateurs;
	
	

	public Responsable(Long id, String nom, String prenom, String email, String telephone, LocalDate dateDeNaissance,
			String motDePasse, List<Etudiant> etudiants, List<Formation> formations, List<Formateur> formateurs) {
		super(id, nom, prenom, email, telephone, dateDeNaissance, motDePasse);
		this.etudiants = etudiants;
		this.formations = formations;
		this.formateurs = formateurs;
	}

	public Responsable(Long id, String nom, String prenom, String email, String telephone, LocalDate dateDeNaissance,
			String motDePasse, List<Formation> formations, List<Formateur> formateurs) {
		super(id, nom, prenom, email, telephone, dateDeNaissance, motDePasse);
		this.formations = formations;
		this.formateurs = formateurs;
	}
public Responsable() {
		
	}

	public Responsable(Long id, String nom, String prenom, String email, String telephone, LocalDate dateDeNaissance,
			String motDePasse, List<Formation> formations) {
		super(id, nom, prenom, email, telephone, dateDeNaissance, motDePasse);
		this.formations = formations;
	}

	public Responsable(Long id, String nom, String prenom, String email, String telephone, LocalDate dateDeNaissance,
			String motDePasse) {
		super(id, nom, prenom, email, telephone, dateDeNaissance, motDePasse);
	}

	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public List<Formateur> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(List<Formateur> formateurs) {
		this.formateurs = formateurs;
	}
}
