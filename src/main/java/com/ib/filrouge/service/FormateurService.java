package com.ib.filrouge.service;

import java.util.List;

import com.ib.filrouge.model.Formateur;

public interface FormateurService {
	
	 List<Formateur> getAll();
	 Formateur selectById(Long id);
	 Formateur save(Formateur formateur);
	 Formateur update(Long id, Formateur  formateur);
	 void delete(Long id);

}
