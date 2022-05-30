package com.ib.filrouge.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private Long id;
	private float prix;
	private String contenu;
	private List<Session> sessions;
	private Responsable responsable;
	

}
