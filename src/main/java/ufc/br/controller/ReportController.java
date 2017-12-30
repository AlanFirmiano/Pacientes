package ufc.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ufc.br.model.Report;
import ufc.br.service.ReportService;
import ufc.br.service.PatientService;

@RestController
@RequestMapping("/report")
@CrossOrigin(origins = "*")
public class ReportController {
	@Autowired
	private ReportService service;
	@Autowired
	private PatientService pservice;
	@PostMapping
	public ResponseEntity<String> save(@RequestBody Report report){
		return service.save(report);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}

	@PutMapping
	public ResponseEntity<String> update(@RequestBody Report report){
		return service.update(report);
	}

	@GetMapping("byPatient/{id}")
	public ResponseEntity<List<Report>> get(@PathVariable Integer id){
		return service.getByPermition(id);
	}

	@GetMapping("byExercise/{id}")
	public ResponseEntity<Double> getByExercise(@PathVariable Integer id){
		return service.getByExercise(id);
	}

	@GetMapping
	public ResponseEntity<List<Report>> get(){
		return service.get();
	}
}
