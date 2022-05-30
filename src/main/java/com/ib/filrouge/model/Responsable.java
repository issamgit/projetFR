package com.ib.filrouge.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Responsable  extends Personne{
	
	private List<Formation> formations;
	private List<Formateur> formateurs;
	public List<Formation> getFormations() {
		return formations;
	}
	public Responsable(Long id, String nom, String prenom, String email, String telephone, LocalDate dateDeNaissance,
			String motDePasse) {
		super(id, nom, prenom, email, telephone, dateDeNaissance, motDePasse);
	}
	public Responsable(Long id, String nom, String prenom, String email, String telephone, LocalDate dateDeNaissance,
			String motDePasse, List<Formation> formations, List<Formateur> formateurs) {
		super(id, nom, prenom, email, telephone, dateDeNaissance, motDePasse);
		this.formations = formations;
		this.formateurs = formateurs;
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
