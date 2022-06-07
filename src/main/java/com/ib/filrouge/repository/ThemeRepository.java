package com.ib.filrouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.Theme;


@Repository
public interface ThemeRepository extends JpaRepository<Theme, Long> {

}
