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

import ufc.br.model.Responsible;
import ufc.br.service.ResponsibleService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "*")
public class ResponsibleController {

	@Autowired
	private ResponsibleService service;

	@PostMapping
	public ResponseEntity<String> save(@RequestBody Responsible responsible){
		return service.save(responsible);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable Integer id){
		return service.delete(id);
	}

	@PutMapping
	public ResponseEntity<String> update(@RequestBody Responsible responsible){
		return service.update(responsible);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Responsible> get(@PathVariable Integer id){
		return service.get(id);
	}

	@GetMapping
	public ResponseEntity<List<Responsible>> get(){
		return service.get();
	}

}
