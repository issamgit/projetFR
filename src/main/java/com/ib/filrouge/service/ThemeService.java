package com.ib.filrouge.service;

import java.util.List;

import com.ib.filrouge.model.Theme;

public interface ThemeService {
	
		List<Theme> getAll();
		Theme selectById(Long id);
		Theme save(Theme theme);
		Theme update(Long id, Theme  theme);
		void delete(Long id);

}
