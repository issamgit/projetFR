package com.ib.filrouge.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ib.filrouge.model.Formation;
import com.ib.filrouge.service.FormationService;

@Controller
@RequestMapping("/ib/formations")
public class FormationController {
	
	@Autowired
	private FormationService formationService;
	
	
	@GetMapping
	public Collection<Formation> getAllFormation()
	{
		return formationService.getAll();
	}

}
