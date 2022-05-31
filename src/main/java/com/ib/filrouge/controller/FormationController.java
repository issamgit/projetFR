package com.ib.filrouge.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ib.filrouge.model.Formation;
import com.ib.filrouge.service.FormationService;

@RestController
public class FormationController {
	
	@Autowired
	private FormationService formationService;
	
	
	@GetMapping("/formations")
	public Collection<Formation> getAllFormation()
	{
		return formationService.getAll();
	}

}
