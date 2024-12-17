package com.gen.genFit.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "tb_exercicio")
public class Exercicio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O atributo exercício é obrigatório")
	private String exercicio;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "exercicio", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("exercicio")
	private List<Serie> serie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExercicio() {
		return exercicio;
	}

	public void setExercicio(String exercicio) {
		this.exercicio = exercicio;
	}

	public List<Serie> getSerie() {
		return serie;
	}

	public void setSerie(List<Serie> serie) {
		this.serie = serie;
	}

}
