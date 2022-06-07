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

import com.ib.filrouge.model.Responsable;
import com.ib.filrouge.service.ResponsableService;

@RestController
@RequestMapping("/api/")
public class ResponsableController {
	
	
	@Autowired
	private ResponsableService responsableService;
	
	@GetMapping("/responsables")
	public List<Responsable> getAllresponsable()
	{
		return responsableService.getAll();
	}
	
	@PostMapping("/responsables")
	public Responsable saveResponsable(@RequestBody Responsable resp)
	{
		return responsableService.save(resp);

	}

	@GetMapping("/responsables/{id}")
	public ResponseEntity<Responsable> getById(@PathVariable Long id)
	{
		Responsable resp= new Responsable();
		resp= responsableService.selectById(id);
		return ResponseEntity.ok(resp);
	}
	
	@PutMapping("/responsables/{id}")
	public ResponseEntity<Responsable> updateResponsable(@PathVariable Long id, @RequestBody Responsable responsable)
	{
		return ResponseEntity.ok(responsableService.update(id, responsable));
	}
	
	@DeleteMapping("/responsables/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteResponsable(@PathVariable Long id)
	{
		responsableService.delete(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("supprime", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
