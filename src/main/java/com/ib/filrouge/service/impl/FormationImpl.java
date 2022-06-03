package com.ib.filrouge.service.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib.filrouge.model.Formation;
import com.ib.filrouge.repository.FormationRepository;
import com.ib.filrouge.service.FormationService;


@Service
public class FormationImpl implements FormationService {
	
	@Autowired
	private FormationRepository formationRepository;

	@Override
	public List<Formation> getAll() {
		return formationRepository.findAll();
	}

	@Override
	public Formation selectById(Long id) {
		return formationRepository.findById(id).get();
	}

	@Override
	public Formation save(Formation formation) {
		return formationRepository.save(formation);
	}

	@Override
	public Formation update(Long id, Formation formation) {
		Formation format = new Formation();
		format=formationRepository.findById(id).get();
		format.setContenu(formation.getContenu());
		format.setPrix(formation.getPrix());
		format.setResponsable(formation.getResponsable());
		format.setSessions(formation.getSessions());
		return formationRepository.save(format);
		
	}

	@Override
	public void delete(Long id) {
		 formationRepository.deleteById(id);
		
	}

}
