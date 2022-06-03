package com.ib.filrouge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib.filrouge.model.Etudiant;
import com.ib.filrouge.repository.EtudiantRepository;
import com.ib.filrouge.service.EtudiantService;
@Service
public class EtudiantServiceImpl implements EtudiantService {
	
	@Autowired
	private EtudiantRepository etudiantRepository;

	@Override
	public List<Etudiant> getAll() {
		return etudiantRepository.findAll();
	}

	@Override
	public Etudiant selectById(Long id) {
		return etudiantRepository.findById(id).get();
	}

	@Override
	public Etudiant save(Etudiant etudiant) {
		return etudiantRepository.save(etudiant);
	}

	@Override
	public Etudiant update(Long id, Etudiant etudiant) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		etudiantRepository.deleteById(id);
		
	}

}
