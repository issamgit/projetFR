package com.ib.filrouge.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Etudiant;
import com.ib.filrouge.model.Personne;

@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long>{
	Optional<Personne> findByEmail(String email);

	Boolean existsByUserName(String userName);

	Personne findByUserName(String userName);

	boolean existsByEmail(String email);


}
