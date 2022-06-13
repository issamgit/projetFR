package com.ib.filrouge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib.filrouge.model.Inscription;
import com.ib.filrouge.model.Responsable;
import com.ib.filrouge.repository.ResponsableRepository;
import com.ib.filrouge.service.ResponsableService;


@Service
public class ResponsableServiceImpl  implements ResponsableService{
	
	@Autowired
	private ResponsableRepository responsableRepository;

	@Override
	public List<Responsable> getAll() {
		return responsableRepository.findAll();
	}

	@Override
	public Responsable selectById(Long id) {
		return responsableRepository.findById(id).get();
	}

	@Override
	public Responsable save(Responsable resp) {
		return responsableRepository.save(resp);
	}

	@Override
	public Responsable update(Long id, Responsable resp) {
		
		Responsable responsable = new Responsable();
		responsable=responsableRepository.findById(id).get();
		
		responsable.setNom(resp.getNom());
		responsable.setPrenom(resp.getPrenom());
		responsable.setTelephone(resp.getTelephone());
		responsable.setEmail(resp.getEmail());
		responsable.setDateDeNaissance(resp.getDateDeNaissance());
		responsable.setFormateurs(resp.getFormateurs());
		responsable.setEtudiants(resp.getEtudiants());
		responsable.setFormations(resp.getFormations());
		responsable.setPassword(resp.getPassword());
		
		return responsableRepository.save(responsable);
		
	}

	@Override
	public void delete(Long id) {
		responsableRepository.deleteById(id);
		
	}

}
