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

import com.ib.filrouge.model.SousTheme;
import com.ib.filrouge.service.SousThemeService;

@RestController
@RequestMapping("/api/")
public class SousThemeController {
	
	@Autowired
	private SousThemeService sousThemeService;
	
	
	
	@GetMapping("/sousthemes")
	public List<SousTheme> getAllSousTheme()
	{
		return sousThemeService.getAll();
	}

	@GetMapping("/sousthemes/{id}")
	public ResponseEntity<SousTheme> getById(@PathVariable Long id)
	{
		SousTheme stheme= new SousTheme();
		stheme= sousThemeService.selectById(id);
		return ResponseEntity.ok(stheme);
	}
	
	@PostMapping("/sousthemes")
	public SousTheme saveSousTheme(@RequestBody SousTheme stheme)
	{
		return sousThemeService.save(stheme);

	}
	
	@PutMapping("/sousthemes/{id}")
	public ResponseEntity<SousTheme> updateSousTheme(@PathVariable Long id, @RequestBody SousTheme stheme)
	{
		return ResponseEntity.ok(sousThemeService.update(id, stheme));	
	}
	
	@DeleteMapping("/sousthemes/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteSousTheme(@PathVariable Long id)
	{
		sousThemeService.delete(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("supprime", Boolean.TRUE);
		return ResponseEntity.ok(response);
	} 


}
