package com.ib.filrouge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Evaluation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;
	private String question;
	private int scoreEval;
	
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
