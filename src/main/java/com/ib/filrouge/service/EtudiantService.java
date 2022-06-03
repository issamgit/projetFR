package com.ib.filrouge.service;

import java.util.List;

import com.ib.filrouge.model.Etudiant;

public interface EtudiantService {
	
	List<Etudiant> getAll();
	Etudiant selectById(Long id);
	Etudiant save(Etudiant etudiant);
	Etudiant update(Long id, Etudiant  etudiant);
	void delete(Long id);

}
