package com.ib.filrouge.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ib.filrouge.model.Theme;
import com.ib.filrouge.repository.ThemeRepository;
import com.ib.filrouge.service.ThemeService;


@Service
public class ThemeServiceIpml implements ThemeService {
	
	
	@Autowired
	private ThemeRepository themeRepository;

	@Override
	public List<Theme> getAll() {
		return themeRepository.findAll();
	}

	@Override
	public Theme selectById(Long id) {
		return themeRepository.findById(id).get();
	}

	@Override
	public Theme save(Theme theme) {
		return themeRepository.save(theme);
	}

	@Override
	public Theme update(Long id, Theme theme) {
		Theme th = new Theme();
		th=themeRepository.findById(id).get();
		th.setIntitule(theme.getIntitule());
		th.setNbjours(theme.getNbjours());
		th.setPrix(theme.getPrix());
		return themeRepository.save(th);	
		}
	

	@Override
	public void delete(Long id) {
		themeRepository.deleteById(id);
		
	}

}
