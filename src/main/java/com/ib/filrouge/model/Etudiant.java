package com.ib.filrouge.model;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Etudiant extends Personne {

	
	private String nomEntreprise;
	private String adresse;
	private boolean isParticulier;
	private long scorePrerequis;
	@OneToMany(mappedBy = "etudiant")
	private Collection<Inscription> inscriptions;
	
	
	
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
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
