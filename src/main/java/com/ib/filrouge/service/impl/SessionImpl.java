package com.ib.filrouge.service.impl;

import java.util.Collection;


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
	public Collection<Session> getAll() {
		return sessionRepository.findAll();
	}

}
