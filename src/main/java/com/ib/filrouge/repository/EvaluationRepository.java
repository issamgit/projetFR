package com.ib.filrouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Evaluation;

@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {

}
