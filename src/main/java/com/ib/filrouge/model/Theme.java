package com.ib.filrouge.model;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Theme {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String intitule;
	private float prix;
	private int nbjours;
	@ManyToMany
	private List<Formation> formations;
	@OneToMany(mappedBy = "theme", cascade = CascadeType.ALL)
	private List<SousTheme> sousThemes;
	

	public Theme(String intitule, float prix, int nbjours) {
		
		this.intitule = intitule;
		this.prix = prix;
		this.nbjours = nbjours;
	}
	public Theme(String intitule, float prix, int nbjours, List<Formation> formations,
			List<SousTheme> sousThemes) {
		
		this.intitule = intitule;
		this.prix = prix;
		this.nbjours = nbjours;
		this.formations = formations;
		this.sousThemes = sousThemes;
	}
	public Theme() {
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getNbjours() {
		return nbjours;
	}
	public void setNbjours(int nbjours) {
		this.nbjours = nbjours;
	}
	public Collection<Formation> getFormations() {
		return formations;
	}
	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}
	public Collection<SousTheme> getSousThemes() {
		return sousThemes;
	}
	public void setSousThemes(List<SousTheme> sousThemes) {
		this.sousThemes = sousThemes;
	}
	
	

}
