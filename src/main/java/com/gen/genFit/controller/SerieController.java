package com.gen.genFit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.gen.genFit.model.Serie;
import com.gen.genFit.repository.SerieRepository;

@RestController
@RequestMapping("/series")
public class SerieController {

    @Autowired
    private SerieRepository serieRepository;

    @PostMapping
    public ResponseEntity<Serie> create(@RequestBody Serie serie) {
        return ResponseEntity.ok(serieRepository.save(serie));
    }

    @GetMapping
    public ResponseEntity<List<Serie>> findAll() {
        return ResponseEntity.ok(serieRepository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serie> findById(@PathVariable Long id) {
        return serieRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Serie> update(@PathVariable Long id, @RequestBody Serie serie) {
        return serieRepository.findById(id)
                .map(existingSerie -> {
                    serie.setId(existingSerie.getId());
                    return ResponseEntity.ok(serieRepository.save(serie));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		
		Optional<Serie> serie = serieRepository.findById(id);
		
		if (serie.isEmpty())
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		
		serieRepository.deleteById(id);
	}
}