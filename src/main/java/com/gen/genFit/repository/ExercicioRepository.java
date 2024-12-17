package com.gen.genFit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gen.genFit.model.Exercicio;

@Repository
public interface ExercicioRepository  extends JpaRepository<Exercicio, Long>{

}
