package com.ib.filrouge.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ib.filrouge.model.Etudiant;
import com.ib.filrouge.model.Personne;
import com.ib.filrouge.repository.PersonneRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	PersonneRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Personne user = userRepository.findByUserName(username);
				//.orElseThrow(()-> new UsernameNotFoundException("User Not Found with username: " + username));

		return UserDetailsImpl.build(user);
	}

}

