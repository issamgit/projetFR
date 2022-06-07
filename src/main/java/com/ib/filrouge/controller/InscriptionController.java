package com.ib.filrouge.controller;

import java.util.Collection;
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

import com.ib.filrouge.model.Inscription;
import com.ib.filrouge.service.InscriptionService;

@RestController
@RequestMapping("/api/")
public class InscriptionController {
	
	@Autowired
	private InscriptionService inscriptionService;
	
	@GetMapping("/inscriptions")
	public List<Inscription> getAllInscription()
	{
		return inscriptionService.getAll();
	}
	
	@PostMapping("/inscriptions")
	public Inscription saveInscription(@RequestBody Inscription insc)
	{
		return inscriptionService.save(insc);

	}

	@GetMapping("/inscriptions/{id}")
	public ResponseEntity<Inscription> getById(@PathVariable Long id)
	{
		Inscription insc= new Inscription();
		insc= inscriptionService.selectById(id);
		return ResponseEntity.ok(insc);
	}
	
	@PutMapping("/inscriptions/{id}")
	public ResponseEntity<Inscription> updateInscription(@PathVariable Long id, @RequestBody Inscription insc)
	{
		
		return ResponseEntity.ok(inscriptionService.update(id, insc));
	}
	
	@DeleteMapping("/inscriptions/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteInscription(@PathVariable Long id)
	{
		inscriptionService.delete(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("supprime", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
