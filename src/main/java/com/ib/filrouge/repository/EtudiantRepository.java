package com.ib.filrouge.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{
	
	Optional<Etudiant> findByEmail(String email);

	Boolean existsByUserName(String userName);

	Boolean existsByEmail(String email);

	Etudiant findByUserName(String userName);
	
}
