package com.ib.filrouge.service;

import java.util.List;

import com.ib.filrouge.model.Evaluation;

public interface EvaluationService {
	
	public List<Evaluation> getAll();
	Evaluation selectById(Long id);
	Evaluation save(Evaluation eval);
	Evaluation update(Long id, Evaluation  eval);
	void delete(Long id);

}
