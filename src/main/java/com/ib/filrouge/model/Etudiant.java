package com.ib.filrouge.model;

import javax.persistence.Entity;

@Entity
public class Etudiant extends Personne {

	
	private String nomEntreprise;
	private String adresse;
	private boolean isParticulier;
	private long scorePrerequis;
}
