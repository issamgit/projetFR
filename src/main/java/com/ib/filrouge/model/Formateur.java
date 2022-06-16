package com.ib.filrouge.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
//@DiscriminatorValue(value = "FOR")
public class Formateur  extends Personne{
	
	private long experience;
	private float score;
	private String expertise;
	@OneToMany(mappedBy = "formateur")
	private List<Session> sessions;
	
	@OneToMany(mappedBy = "formateur")
	private List<Etudiant> etudiants;
	@ManyToOne
	private Responsable responsable;
	
	
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public Formateur() {
		
	}
	public Formateur(Long id, String nom, String prenom, String email, String telephone, LocalDate dateDeNaissance,
			String motDePasse, long experience, float score, String expertise) {
		super(id, nom, prenom, email, telephone, dateDeNaissance, motDePasse);
		this.experience = experience;
		this.score = score;
		this.expertise = expertise;
	}
	public long getExperience() {
		return experience;
	}
	public void setExperience(long experience) {
		this.experience = experience;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	public List<Session> getSessions() {
		return sessions;
	}
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

}
