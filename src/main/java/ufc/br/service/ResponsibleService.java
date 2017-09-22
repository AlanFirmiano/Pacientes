package ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ufc.br.model.Responsible;
import ufc.br.repository.ResponsibleRepository;

@Service
public class ResponsibleService {
	@Autowired
	ResponsibleRepository repository;

	public ResponseEntity<String> save(Responsible responsible){
		repository.save(responsible);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);		
	}

	public ResponseEntity<String> delete(Integer id){
		repository.delete(id);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Responsible responsible){
		repository.save(responsible);
		return new ResponseEntity<String>("sucesso", HttpStatus.OK);
	}

	public ResponseEntity<Responsible> get(Integer id){
		return new ResponseEntity<Responsible>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<List<Responsible>> get(){
		return new ResponseEntity<List<Responsible>>(this.repository.findAll(), HttpStatus.OK);
	}
}
