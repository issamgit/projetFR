package com.ib.filrouge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib.filrouge.model.Evaluation;
import com.ib.filrouge.model.Formation;
import com.ib.filrouge.repository.EvaluationRepository;
import com.ib.filrouge.service.EvaluationService;

@Service
public class EvaluationServiceImpl  implements EvaluationService{
	
	
	@Autowired
	private EvaluationRepository evaluationRepository;

	@Override
	public List<Evaluation> getAll() {
		return evaluationRepository.findAll();
	}

	@Override
	public Evaluation selectById(Long id) {
		return evaluationRepository.findById(id).get();
	}

	@Override
	public Evaluation save(Evaluation eval) {
		return evaluationRepository.save(eval);
	}

	@Override
	public Evaluation update(Long id, Evaluation eval) {
		Evaluation ev = new Evaluation();
		ev=evaluationRepository.findById(id).get();
		ev.setQuestion(eval.getQuestion());
		ev.setScoreEval(eval.getScoreEval());
		ev.setEtudiant(eval.getEtudiant());
		return evaluationRepository.save(ev);
	}

	@Override
	public void delete(Long id) {
		 evaluationRepository.deleteById(id);
		
	}

}
