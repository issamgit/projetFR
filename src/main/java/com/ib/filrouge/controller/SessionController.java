package com.ib.filrouge.controller;

import java.util.Collection;
import java.util.HashMap;
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

import com.ib.filrouge.model.Session;
import com.ib.filrouge.service.SessionService;

@RestController
@RequestMapping
public class SessionController {
	
	@Autowired
	private SessionService sessionService;
	
	
	@GetMapping("/sessions")
	public Collection<Session> getAllSession()
	{
		return sessionService.getAll();
	}
	
	@PostMapping("/sessions")
	public Session saveSession(@RequestBody Session sess)
	{
		return sessionService.save(sess);

	}

	@GetMapping("/sessions/{id}")
	public ResponseEntity<Session> getById(@PathVariable Long id)
	{
		Session session= new Session();
		session= sessionService.selectById(id);
		return ResponseEntity.ok(session);
	}
	
	@PutMapping("/sessions/{id}")
	public ResponseEntity<Session> updateSession(@PathVariable Long id, @RequestBody Session sess)
	{
		/*Session Session= new Session();
		Session= SessionService.selectById(id);
		Session.setContenu(form.getContenu());
		Session.setPrix(form.getPrix());
		 Session.setResponsable(form.getResponsable());
		Session.setSessions(form.getSessions());*/
		
		return ResponseEntity.ok(sessionService.update(id, sess));
	}
	
	@DeleteMapping("/sessions/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteSession(@PathVariable Long id)
	{
		sessionService.delete(id);
		Map<String,Boolean> response=new HashMap<>();
		response.put("supprime", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
}
