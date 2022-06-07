package com.ib.filrouge.service;

import java.util.List;

import com.ib.filrouge.model.Inscription;

public interface InscriptionService {
	
	List<Inscription> getAll();
	Inscription selectById(Long id);
	Inscription save(Inscription inscription);
	Inscription update(Long id, Inscription  inscription);
	void delete(Long id);


}
