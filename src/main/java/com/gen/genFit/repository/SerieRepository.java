package com.gen.genFit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gen.genFit.model.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {
}

