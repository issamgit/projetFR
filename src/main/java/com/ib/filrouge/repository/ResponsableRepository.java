package com.ib.filrouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Responsable;

@Repository
public interface ResponsableRepository  extends JpaRepository<Responsable, Long>{

}