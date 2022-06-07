package com.ib.filrouge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib.filrouge.model.Formateur;
import com.ib.filrouge.repository.FormateurRepository;
import com.ib.filrouge.service.FormateurService;

@Service
public class FormateurServiceImpl implements FormateurService{
	
	@Autowired
	private FormateurRepository formateurRepository;

	@Override
	public List<Formateur> getAll() {
		return formateurRepository.findAll();
	}

	@Override
	public Formateur selectById(Long id) {
		return formateurRepository.findById(id).get();
	}

	@Override
	public Formateur save(Formateur formateur) {
		return formateurRepository.save(formateur);
	}

	@Override
	public Formateur update(Long id, Formateur formateur) {
		Formateur form = new Formateur();
		form=formateurRepository.findById(id).get();
		form.setNom(formateur.getNom());
		form.setPrenom(formateur.getPrenom());
		form.setTelephone(formateur.getTelephone());
		form.setEmail(formateur.getEmail());
		form.setDateDeNaissance(formateur.getDateDeNaissance());
		form.setExperience(formateur.getExperience());
		form.setExpertise(formateur.getExpertise());
		form.setScore(formateur.getScore());
		form.setEtudiants(formateur.getEtudiants());
		form.setSessions(formateur.getSessions());
		return formateurRepository.save(form);
		
	}

	@Override
	public void delete(Long id) {
		formateurRepository.deleteById(id);
		
	}

}
