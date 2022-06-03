package com.ib.filrouge.service;

import java.util.List;

import com.ib.filrouge.model.Session;

public interface SessionService {
	
	public List<Session> getAll();
	Session selectById(Long id);
	Session save(Session session);
	Session update(Long id, Session  session);
	void delete(Long id);


	


}
