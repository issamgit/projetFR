package com.ib.filrouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Salle;

@Repository
public interface SalleRepository extends JpaRepository<Salle, Long>{
	
	

}
