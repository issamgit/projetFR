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

import com.ib.filrouge.model.Salle;
import com.ib.filrouge.service.SalleService;

@RestController
@RequestMapping("/api/")
public class SalleController {
	
	@Autowired
	private SalleService salleService;
	
	@GetMapping("/salles")
	public List<Salle> getAllSalle()
	{
		return salleService.getAll();
	}

	@GetMapping("/salles/{id}")
	public ResponseEntity<Salle> getById(@PathVariable Long id)
	{
		Salle salle= new Salle();
		salle= salleService.selectById(id);
		return ResponseEntity.ok(salle);
	}
	
	@PostMapping("/salles")
	public Salle saveSalle(@RequestBody Salle salle)
	{
		return salleService.save(salle);

	}
	
	@PutMapping("/salles/{id}")
	public ResponseEntity<Salle> updateSalle(@PathVariable Long id, @RequestBody Salle salle)
	{
		return ResponseEntity.ok(salleService.update(id, salle));	
	}
	
	@DeleteMapping("/salles/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteSalle(@PathVariable Long id)
	{
		salleService.delete(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("supprime", Boolean.TRUE);
		return ResponseEntity.ok(response);
	} 
}
