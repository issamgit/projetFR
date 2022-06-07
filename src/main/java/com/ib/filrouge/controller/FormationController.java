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

import com.ib.filrouge.model.Formation;
import com.ib.filrouge.service.FormationService;

@RestController
@RequestMapping("/api/")
public class FormationController {
	
	@Autowired
	private FormationService formationService;
	
	
	@GetMapping("/formations")
	public List<Formation> getAllFormation()
	{
		return formationService.getAll();
	}
	
	@PostMapping("/formations")
	public Formation saveFormation(@RequestBody Formation format)
	{
		return formationService.save(format);

	}

	@GetMapping("/formations/{id}")
	public ResponseEntity<Formation> getById(@PathVariable Long id)
	{
		Formation formation= new Formation();
		formation= formationService.selectById(id);
		return ResponseEntity.ok(formation);
	}
	
	@PutMapping("/formations/{id}")
	public ResponseEntity<Formation> updateFormation(@PathVariable Long id, @RequestBody Formation form)
	{
		/*Formation formation= new Formation();
		formation= formationService.selectById(id);
		formation.setContenu(form.getContenu());
		formation.setPrix(form.getPrix());
		 formation.setResponsable(form.getResponsable());
		formation.setSessions(form.getSessions());*/
		
		return ResponseEntity.ok(formationService.update(id, form));
	}
	
	@DeleteMapping("/formations/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteFormation(@PathVariable Long id)
	{
		formationService.delete(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("supprime", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
