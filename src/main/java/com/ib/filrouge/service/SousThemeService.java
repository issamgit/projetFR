package com.ib.filrouge.service;

import java.util.List;

import com.ib.filrouge.model.SousTheme;

public interface SousThemeService {
	
	List<SousTheme> getAll();
	SousTheme selectById(Long id);
	SousTheme save(SousTheme stheme);
	SousTheme update(Long id, SousTheme  stheme);
	void delete(Long id);

}
