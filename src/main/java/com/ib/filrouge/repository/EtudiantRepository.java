package com.ib.filrouge.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Etudiant;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{
	
	/*Optional<Etudiant> findByEmail(String email);

	Boolean existsByUserName(String userName);

	Optional<Etudiant> findByUsername(String email);

	boolean existsByEmail(String email);*/
	
	

}
