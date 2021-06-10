package com.oracle.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.model.Disease;
import com.oracle.service.DiseaseService;

@CrossOrigin
@RestController
@RequestMapping("/nabta")
public class DiseaseRest {
	@Autowired
	private DiseaseService diseaseService;

	

	@GetMapping("/")
	public List<Disease> findAll() {
		return diseaseService.findAll();
	}

	@GetMapping("/id/{id}")
	public Disease findById(@PathVariable Long id) {
		return diseaseService.findById(id);
	}

	@GetMapping("/nom/{nom}/langue/{langue}")
	public Disease findByNomAndLangue(@PathVariable String nom, @PathVariable String langue) {
		return diseaseService.findByNomAndLangue(nom, langue);
	}
	@GetMapping("/nomClasse/{nomClasse}/langue/{langue}")
	public Disease findByNomClasseAndLangue(@PathVariable String nomClasse, @PathVariable String langue) {
		return diseaseService.findByNomClasseAndLangue(nomClasse, langue);
	}

	@PostMapping("/")
	public Disease addDisease(@RequestBody Disease disease) {
		return diseaseService.addDisease(disease);
	}

	@PutMapping("/")
	public Disease update(@RequestBody Disease disease) {
		return diseaseService.update(disease);
	}
	@DeleteMapping("/{id}")
	public int delete(@PathVariable Long id) {
		return diseaseService.delete(id);
	}

}
