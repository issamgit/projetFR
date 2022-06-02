package com.ib.filrouge.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ib.filrouge.model.Session;
import com.ib.filrouge.service.SessionService;

@RestController
@RequestMapping
public class SessionController {
	
	@Autowired
	private SessionService sessionService;
	
	//TEST ISSAM
	@GetMapping("/sessions")
	public ResponseEntity<Collection<Session>> getAllSession()
	{
		return new ResponseEntity<>(sessionService.getAll(),HttpStatus.OK);
	}

}
