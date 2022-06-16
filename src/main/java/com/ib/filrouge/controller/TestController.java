package com.ib.filrouge.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/test")
public class TestController {
	@GetMapping("/all")
	public String allAccess() {
		return "Espace public.";
	}
	
	@GetMapping("/user")
	//@PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_RESPONSABLE') or hasRole('ROLE_ADMIN')")
	@Secured({"ROLE_RESPONSABLE","ROLE_ETUDIANT","ROLE_FORMATEUR"})
	public String userAccess() {
		return "Espace Etudiant.";
	}

	@GetMapping("/for")
	//@PreAuthorize("hasRole('RESPONSABLE')")
	@Secured("ROLE_FORMATEUR")
	public String moderatorAccess() {
		return " Espace Formateur.";
	}

	@GetMapping("/res")
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	@Secured("ROLE_RESPONSABLE")
	public String adminAccess() {
		return "Espace Responsable.";
	}
}
