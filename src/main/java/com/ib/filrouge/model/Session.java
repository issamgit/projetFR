package com.ib.filrouge.model;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Session {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE )
	private long id;
	private LocalDate dateDebut;
	private LocalDate detaFin;
	private boolean isInter;
	private boolean logistique;
	@OneToMany(mappedBy = "session")
	private Collection<Inscription> inscriptions;
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
	
	
	
	

}
