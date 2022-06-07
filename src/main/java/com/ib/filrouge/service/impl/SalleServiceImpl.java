package com.ib.filrouge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib.filrouge.model.Salle;
import com.ib.filrouge.repository.SalleRepository;
import com.ib.filrouge.service.SalleService;

@Service
public class SalleServiceImpl implements SalleService{
	
	
	@Autowired 
	SalleRepository salleRepository;

	public List<Salle> getAll() {
		return salleRepository.findAll();
	}


	public Salle selectById(Long id) {
		return salleRepository.findById(id).get();
	}

	
	public Salle save(Salle salle) {
		return salleRepository.save(salle);
	}


	public Salle update(Long id, Salle salle) {
		Salle s = new Salle();
		s=salleRepository.findById(id).get();
		s.setIntitule(salle.getIntitule());
		s.setNbPlace(salle.getNbPlace());
		
		return salleRepository.save(s);	}


	public void delete(Long id) {
		salleRepository.deleteById(id);
		
	}

}
