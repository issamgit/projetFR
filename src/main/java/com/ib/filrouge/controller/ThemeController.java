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

import com.ib.filrouge.model.Theme;
import com.ib.filrouge.service.ThemeService;

@RestController
@RequestMapping("/api/")
public class ThemeController {
	
	@Autowired
	private ThemeService themeService;
	
	@GetMapping("/themes")
	public List<Theme> getAllTheme()
	{
		return themeService.getAll();
	}

	@GetMapping("/themes/{id}")
	public ResponseEntity<Theme> getById(@PathVariable Long id)
	{
		Theme theme= new Theme();
		theme= themeService.selectById(id);
		return ResponseEntity.ok(theme);
	}
	
	@PostMapping("/themes")
	public Theme saveTheme(@RequestBody Theme theme)
	{
		return themeService.save(theme);

	}
	
	@PutMapping("/themes/{id}")
	public ResponseEntity<Theme> updateTheme(@PathVariable Long id, @RequestBody Theme theme)
	{
		return ResponseEntity.ok(themeService.update(id, theme));	
	}
	
	@DeleteMapping("/themes/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteTheme(@PathVariable Long id)
	{
		themeService.delete(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("supprime", Boolean.TRUE);
		return ResponseEntity.ok(response);
	} 

}
