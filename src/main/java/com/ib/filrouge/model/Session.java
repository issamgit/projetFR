package com.ib.filrouge.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	
	@OneToMany(mappedBy = "session")
	private Collection<Inscription> inscriptions;
	@ManyToOne
	private Formation formation;
	public Salle getSalle() {
		return salle;
	}
	public void setSalle(Salle salle) {
		this.salle = salle;
	}
	public Collection<Evaluation> getCollection() {
		return collection;
	}
	public void setCollection(Collection<Evaluation> collection) {
		this.collection = collection;
	}
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	@OneToMany(mappedBy = "session")
	private Collection<Evaluation> collection;
	@ManyToOne
	private Formateur formateur;
	public Session(LocalDate dateDebut, LocalDate detaFin, boolean isInter, boolean logistique) {
		
		this.dateDebut = dateDebut;
		this.detaFin = detaFin;
		this.isInter = isInter;
		this.logistique = logistique;
	}
	public Session() {
		
	}
	
	public Session(LocalDate dateDebut, LocalDate detaFin, boolean isInter, boolean logistique,
			Collection<Inscription> inscriptions) {
		super();
		this.dateDebut = dateDebut;
		this.detaFin = detaFin;
		this.isInter = isInter;
		this.logistique = logistique;
		this.inscriptions = inscriptions;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Collection<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(Collection<Inscription> inscriptions) {
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
