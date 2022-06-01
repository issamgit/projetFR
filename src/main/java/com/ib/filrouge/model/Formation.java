package com.ib.filrouge.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Formation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float prix;
	private String contenu;
	@OneToMany(mappedBy = "formation")
	private List<Session> sessions;
	@ManyToMany(mappedBy = "formations")
	private List<Theme> themes;

	public Formation() {
		super();
	}

	public Formation(float prix, String contenu, List<Session> sessions, Responsable responsable) {
		super();
		this.prix = prix;
		this.contenu = contenu;
		this.sessions = sessions;
		this.responsable = responsable;
	}

	public Formation(float prix, String contenu) {
		super();
		this.prix = prix;
		this.contenu = contenu;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	public Responsable getResponsable() {
		return responsable;
	}

	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}
	
	@ManyToOne
	private Responsable responsable;

}
