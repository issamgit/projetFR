package com.ib.filrouge.model;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant extends Personne {

	
	private String nomEntreprise;
	private String adresse;
	private boolean isParticulier;
	private long scorePrerequis;
	@ManyToMany
	private Collection<Inscription> inscriptions;
	@ManyToMany
	private Collection<Evaluation> evaluations;
	@ManyToOne
	private Responsable responsable;
	@ManyToOne
	private Formateur formateur;
	
	
	
	public Collection<Evaluation> getEvaluations() {
		return evaluations;
	}
	public void setEvaluations(Collection<Evaluation> evaluations) {
		this.evaluations = evaluations;
	}
	public Responsable getResponsable() {
		return responsable;
	}
	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	public Etudiant() {
		
	}
	public Etudiant(Long id, String nom, String prenom, String email, String telephone, LocalDate dateDeNaissance,
			String motDePasse, String nomEntreprise, String adresse, boolean isParticulier, long scorePrerequis) {
		super(id, nom, prenom, email, telephone, dateDeNaissance, motDePasse);
		this.nomEntreprise = nomEntreprise;
		this.adresse = adresse;
		this.isParticulier = isParticulier;
		this.scorePrerequis = scorePrerequis;
	}
	public String getNomEntreprise() {
		return nomEntreprise;
	}
	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}
	
	public Etudiant(Long id, String nom, String prenom, String email, String telephone, LocalDate dateDeNaissance,
			String motDePasse, String nomEntreprise, String adresse, boolean isParticulier, long scorePrerequis,
			Collection<Inscription> inscriptions) {
		super(id, nom, prenom, email, telephone, dateDeNaissance, motDePasse);
		this.nomEntreprise = nomEntreprise;
		this.adresse = adresse;
		this.isParticulier = isParticulier;
		this.scorePrerequis = scorePrerequis;
		this.inscriptions = inscriptions;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Collection<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(Collection<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	public boolean isParticulier() {
		return isParticulier;
	}
	public void setParticulier(boolean isParticulier) {
		this.isParticulier = isParticulier;
	}
	public long getScorePrerequis() {
		return scorePrerequis;
	}
	public void setScorePrerequis(long scorePrerequis) {
		this.scorePrerequis = scorePrerequis;
	}
}
