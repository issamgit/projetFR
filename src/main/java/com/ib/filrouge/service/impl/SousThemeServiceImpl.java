package com.ib.filrouge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib.filrouge.model.SousTheme;
import com.ib.filrouge.model.Theme;
import com.ib.filrouge.repository.SousThemeRepository;
import com.ib.filrouge.service.SousThemeService;


@Service
public class SousThemeServiceImpl implements SousThemeService {
	
	@Autowired
	private SousThemeRepository sousThemeRepository;

	@Override
	public List<SousTheme> getAll() {
		return sousThemeRepository.findAll();
	}

	@Override
	public SousTheme selectById(Long id) {
		return sousThemeRepository.findById(id).get();
	}

	@Override
	public SousTheme save(SousTheme stheme) {
		return sousThemeRepository.save(stheme);
	}

	@Override
	public SousTheme update(Long id, SousTheme stheme) {
		SousTheme th = new SousTheme();
		th=sousThemeRepository.findById(id).get();
		th.setIntitule(stheme.getIntitule());
		th.setTheme(stheme.getTheme());
		return sousThemeRepository.save(th);
	}

	@Override
	public void delete(Long id) {
		sousThemeRepository.deleteById(id);
		
	}


}
