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
		return "Public Content.";
	}
	
	@GetMapping("/user")
	//@PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_RESPONSABLE') or hasRole('ROLE_ADMIN')")
	@Secured({"ROLE_ADMIN","ROLE_USER","ROLE_RESPONSABLE"})
	public String userAccess() {
		return "User Content.";
	}

	@GetMapping("/mod")
	//@PreAuthorize("hasRole('RESPONSABLE')")
	@Secured("ROLE_RESPONSABLE")
	public String moderatorAccess() {
		return "Responsable Board.";
	}

	@GetMapping("/admin")
	//@PreAuthorize("hasRole('ROLE_ADMIN')")
	@Secured("ROLE_ADMIN")
	public String adminAccess() {
		return "Admin Board.";
	}
}
