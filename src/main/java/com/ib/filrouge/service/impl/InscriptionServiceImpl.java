package com.ib.filrouge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib.filrouge.model.Inscription;
import com.ib.filrouge.repository.InscriptionRepository;
import com.ib.filrouge.service.InscriptionService;

@Service
public class InscriptionServiceImpl implements InscriptionService {
	
	@Autowired
	private InscriptionRepository inscriptionRepository;

	@Override
	public List<Inscription> getAll() {
		return inscriptionRepository.findAll();
	}

	@Override
	public Inscription selectById(Long id) {
		return inscriptionRepository.findById(id).get();
	}

	@Override
	public Inscription save(Inscription inscription) {
		return inscriptionRepository.save(inscription);
	}

	@Override
	public Inscription update(Long id, Inscription inscription) {
		Inscription insc = new Inscription();
		insc=inscriptionRepository.findById(id).get();
		
		insc.setDateInscription(inscription.getDateInscription());
		insc.setPaiement(inscription.isPaiement());
		insc.setSession(inscription.getSession());
		insc.setEtudiant(inscription.getEtudiant());
		
		return inscriptionRepository.save(insc);
	}

	@Override
	public void delete(Long id) {
		inscriptionRepository.deleteById(id);
		
	}

}
