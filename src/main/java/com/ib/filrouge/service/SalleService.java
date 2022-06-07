package com.ib.filrouge.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ib.filrouge.model.Salle;

public interface SalleService {
	
	 List<Salle> getAll();
	Salle selectById(Long id);
	Salle save(Salle salle);
	Salle update(Long id, Salle  salle);
	void delete(Long id);
	

}
