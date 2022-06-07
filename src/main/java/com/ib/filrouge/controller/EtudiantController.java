package com.ib.filrouge.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ib.filrouge.model.Etudiant;
import com.ib.filrouge.model.Session;
import com.ib.filrouge.service.EtudiantService;

@RestController
@RequestMapping("/api/")
public class EtudiantController {
	
	@Autowired
	private EtudiantService etudiantService;
	
	
	@GetMapping("/etudiants")
	public List<Etudiant> getAllEtudiant()
	{
		return etudiantService.getAll();
	}
	
	@GetMapping("/etudiants/{id}")
	public Etudiant getById(@PathVariable Long id)
	{
		return etudiantService.selectById(id);
	}
	
	
	@DeleteMapping("/etudiants/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteEmployee(@PathVariable Long id) {
		etudiantService.delete(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("supprime", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	@PutMapping("/etudiants/{id}")
	public ResponseEntity<Etudiant> updateSession(@PathVariable Long id, @RequestBody Etudiant etudiant)
	{		
		return ResponseEntity.ok(etudiantService.update(id, etudiant));
	}

}
