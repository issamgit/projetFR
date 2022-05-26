package com.ib.filrouge.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Inscription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	private LocalDate dateInscription;
	private boolean paiement;
	@ManyToOne
	private Session session;
	@ManyToOne
	private Etudiant etudiant;
	public Inscription() {
		
	}
	public Inscription(LocalDate dateInscription, boolean paiement) {
	
		this.dateInscription = dateInscription;
		this.paiement = paiement;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public LocalDate getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(LocalDate dateInscription) {
		this.dateInscription = dateInscription;
	}
	public boolean isPaiement() {
		return paiement;
	}
	public void setPaiement(boolean paiement) {
		this.paiement = paiement;
	}
	
	

}
