package com.ib.filrouge.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib.filrouge.model.Session;
import com.ib.filrouge.repository.SessionRepository;
import com.ib.filrouge.service.SessionService;


@Service
public class SessionImpl  implements SessionService{
	
	@Autowired
	private SessionRepository sessionRepository;

	@Override
	public List<Session> getAll() {
		return sessionRepository.findAll();
	}

	@Override
	public Session selectById(Long id) {
	
		return sessionRepository.findById(id).get();
	}

	@Override
	public Session save(Session session) {
		return sessionRepository.save(session);
	}

	@Override
	public Session update(Long id, Session session) {
		Session s = new Session();
		s=sessionRepository.findById(id).get();
		s.setDateDebut(session.getDateDebut());
		s.setDetaFin(session.getDetaFin());
		s.setInter(session.isInter());
		s.setSalle(session.getSalle());
		s.setActive(session.isActive());
		s.setInscriptions(session.getInscriptions());
		s.setLogistique(session.isLogistique());		
		s.setFormateur(session.getFormateur());
		s.setInscriptions(session.getInscriptions());
		return sessionRepository.save(s);
		
		
	}

	@Override
	public void delete(Long id) {
		sessionRepository.deleteById(id);
		
	}

}
