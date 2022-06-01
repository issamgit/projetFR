package com.ib.filrouge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Evaluation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String question;
	private int scoreEval;
	@ManyToOne
	private Etudiant etudiant;
	@ManyToOne
	private Session session;
	
	
	public Evaluation(String question, int scoreEval, Etudiant etudiant,Session session) {
		
		this.question = question;
		this.scoreEval = scoreEval;
		this.etudiant = etudiant;
		this.session=session;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Evaluation() {
		
	}
	public Evaluation(String question, int scoreEval) {
		
		this.question = question;
		this.scoreEval = scoreEval;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getScoreEval() {
		return scoreEval;
	}
	public void setScoreEval(int scoreEval) {
		this.scoreEval = scoreEval;
	}
	
	

}
