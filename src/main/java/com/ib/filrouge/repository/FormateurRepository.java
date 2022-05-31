package com.ib.filrouge.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Formateur;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Long> {
	
	Optional<Formateur> findByEmail(String email);

	Boolean existsByEmail(String email);

}
