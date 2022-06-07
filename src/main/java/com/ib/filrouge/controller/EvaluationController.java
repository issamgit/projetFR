package com.ib.filrouge.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ib.filrouge.model.Evaluation;
import com.ib.filrouge.service.EvaluationService;

@RestController
@RequestMapping("/api/")
public class EvaluationController {
	
	@Autowired
	private EvaluationService evaluationService;
	
	@GetMapping("/evaluations")
	public List<Evaluation> getAllEvaluation()
	{
		return evaluationService.getAll();
	}

	@GetMapping("/evaluations/{id}")
	public ResponseEntity<Evaluation> getById(@PathVariable Long id)
	{
		Evaluation eval= new Evaluation();
		eval= evaluationService.selectById(id);
		return ResponseEntity.ok(eval);
	}
	
	@PostMapping("/evaluations")
	public ResponseEntity<Evaluation> saveEval(@RequestBody Evaluation eval)
	{
		return ResponseEntity.ok(evaluationService.save(eval));

	}
	
	@PutMapping("/evaluations/{id}")
	public ResponseEntity<Evaluation> updateEval(@PathVariable Long id, @RequestBody Evaluation eval)
	{
		return ResponseEntity.ok(evaluationService.update(id, eval));	
	}
	
	@DeleteMapping("/evaluations/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteEval(@PathVariable Long id)
	{
		evaluationService.delete(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("supprime", Boolean.TRUE);
		return ResponseEntity.ok(response);
	} 

}
