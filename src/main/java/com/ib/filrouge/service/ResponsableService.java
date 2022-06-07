package com.ib.filrouge.service;

import java.util.List;

import com.ib.filrouge.model.Responsable;

public interface ResponsableService {
	
	 List<Responsable> getAll();
	Responsable selectById(Long id);
	Responsable save(Responsable resp);
	Responsable update(Long id, Responsable  resp);
	void delete(Long id);

}
