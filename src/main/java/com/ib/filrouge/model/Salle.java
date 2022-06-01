package com.ib.filrouge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Salle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String intitule;
	private int  nbPlace;
	@OneToOne(mappedBy = "salle")
	private Session session;
	public Salle(String intitule, int nbPlace, Session session) {
		super();
		this.intitule = intitule;
		this.nbPlace = nbPlace;
		this.session = session;
	}
	public Salle(String intitule, int nbPlace) {
		super();
		this.intitule = intitule;
		this.nbPlace = nbPlace;
	}
	public Salle() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public int getNbPlace() {
		return nbPlace;
	}
	public void setNbPlace(int nbPlace) {
		this.nbPlace = nbPlace;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	

}
