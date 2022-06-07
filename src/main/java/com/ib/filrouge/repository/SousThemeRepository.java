package com.ib.filrouge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ib.filrouge.model.SousTheme;


@Repository
public interface SousThemeRepository extends JpaRepository<SousTheme, Long> {

}
