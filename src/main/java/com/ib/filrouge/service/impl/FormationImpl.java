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
	public Collection<Formation> getAll() {
		return formationRepository.findAll();
	}

}
