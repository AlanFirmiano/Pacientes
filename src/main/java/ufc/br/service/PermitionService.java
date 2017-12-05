package ufc.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufc.br.model.Patient;
import ufc.br.model.Permition;
import ufc.br.repository.PermitionRepository;

import java.util.List;

@Service
public class PermitionService {
    @Autowired
    PermitionRepository repository;

    public ResponseEntity<String> save(Permition permition){
        repository.save(permition);
        return new ResponseEntity<String>(permition.getGrasp().getExercise()+" permitido!", HttpStatus.OK);

    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("removido", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Permition permition){
        repository.save(permition);
        return new ResponseEntity<String>("autualizado", HttpStatus.OK);
    }

    public ResponseEntity<Permition> get(Integer id){
        return new ResponseEntity<Permition>(this.repository.findOne(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Permition>> get(Patient patient){
        return new ResponseEntity<List<Permition>>(this.repository.findByPatient(patient), HttpStatus.OK);
    }

    public ResponseEntity<List<Permition>> get(){
        return new ResponseEntity<List<Permition>>(this.repository.findAll(), HttpStatus.OK);
    }
}
