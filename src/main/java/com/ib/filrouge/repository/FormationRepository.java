package com.ib.filrouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Formation;

@Repository
public interface FormationRepository extends JpaRepository<Formation, Long> {

}
