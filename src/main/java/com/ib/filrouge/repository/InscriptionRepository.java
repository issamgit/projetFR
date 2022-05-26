package com.ib.filrouge.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Inscription;
import com.ib.filrouge.model.Session;

@Repository
public interface InscriptionRepository extends JpaRepository<Inscription, Long> {
	
	List<Inscription> findBySession(Session session);
	

}
