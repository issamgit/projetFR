package com.ib.filrouge.model;

import java.time.LocalDate;
import java.util.List;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long id;
	private LocalDate dateDebut;
	private LocalDate detaFin;
	private boolean isInter;
	private boolean logistique;
	private boolean active;
	@OneToOne
	private Salle salle;
	@OneToMany(mappedBy = "session",  cascade = CascadeType.ALL)
	private List<Inscription> inscriptions;
	@ManyToOne
	private Formation formation;
	@OneToMany(mappedBy = "session", cascade = CascadeType.PERSIST)
	private List<Evaluation> evaluations;
	@ManyToOne
	private Formateur formateur;
	
	
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public List<Evaluation> getList() {
		return evaluations;
	}
	public void setList(List<Evaluation> evaluation) {
		this.evaluations = evaluation;
	}
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	
	public Session(LocalDate dateDebut, LocalDate detaFin, boolean isInter, boolean logistique) {
		
		this.dateDebut = dateDebut;
		this.detaFin = detaFin;
		this.isInter = isInter;
		this.logistique = logistique;
	}
	public Session() {
		
	}
	
	public Session(LocalDate dateDebut, LocalDate detaFin, boolean isInter, boolean logistique,
			List<Inscription> inscriptions) {
		
		this.dateDebut = dateDebut;
		this.detaFin = detaFin;
		this.isInter = isInter;
		this.logistique = logistique;
		this.inscriptions = inscriptions;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDetaFin() {
		return detaFin;
	}
	public void setDetaFin(LocalDate detaFin) {
		this.detaFin = detaFin;
	}
	public boolean isInter() {
		return isInter;
	}
	public void setInter(boolean isInter) {
		this.isInter = isInter;
	}
	public boolean isLogistique() {
		return logistique;
	}
	public void setLogistique(boolean logistique) {
		this.logistique = logistique;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	
	
	

}
