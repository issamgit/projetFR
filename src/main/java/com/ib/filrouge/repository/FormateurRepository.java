package com.ib.filrouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Formateur;

@Repository
public interface FormateurRepository extends JpaRepository<Formateur, Long> {

}
