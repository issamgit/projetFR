package com.ib.filrouge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class SousTheme {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String intitule;
	@ManyToOne
	private Theme theme;
	public SousTheme(String intitule) {
		super();
		this.intitule = intitule;
	}
	public SousTheme() {
		super();
	}
	public SousTheme(String intitule, Theme theme) {
		super();
		this.intitule = intitule;
		this.theme = theme;
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
	public Theme getTheme() {
		return theme;
	}
	public void setTheme(Theme theme) {
		this.theme = theme;
	}

}
