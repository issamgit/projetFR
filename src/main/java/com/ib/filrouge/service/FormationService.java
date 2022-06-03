package com.ib.filrouge.service;

import java.util.Collection;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ib.filrouge.model.Formation;

public interface FormationService {
	
	public List<Formation> getAll();
	Formation selectById(Long id);
	Formation save(Formation formation);
	Formation update(Long id, Formation  formation);
	void delete(Long id);

}
