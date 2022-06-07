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

import com.ib.filrouge.model.Formateur;
import com.ib.filrouge.service.FormateurService;

@RestController
@RequestMapping("/api/")
public class FormateurController {
	
	
	@Autowired
	private FormateurService formateurService;
	
	@GetMapping("/formateurs")
	public List<Formateur> getAllFormateur()
	{
		return formateurService.getAll();
	}
	
	@PostMapping("/formateurs")
	public Formateur saveFormateur(@RequestBody Formateur form)
	{
		return formateurService.save(form);

	}

	@GetMapping("/formateurs/{id}")
	public ResponseEntity<Formateur> getById(@PathVariable Long id)
	{
		Formateur form= new Formateur();
		form= formateurService.selectById(id);
		return ResponseEntity.ok(form);
	}
	
	@PutMapping("/formateurs/{id}")
	public ResponseEntity<Formateur> updateFormateur(@PathVariable Long id, @RequestBody Formateur formateur)
	{
		return ResponseEntity.ok(formateurService.update(id, formateur));
	}
	
	@DeleteMapping("/formateurs/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteFormateur(@PathVariable Long id)
	{
		formateurService.delete(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("supprime", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
