package ufc.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufc.br.model.Grasp;
import ufc.br.repository.GraspRepository;

import java.util.List;

@Service
public class GraspService {
    @Autowired
    GraspRepository repository;

    public ResponseEntity<String> save(Grasp grasp){
        repository.save(grasp);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Grasp grasp){
        repository.save(grasp);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Grasp> get(Integer id){
        return new ResponseEntity<Grasp>(this.repository.findOne(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Grasp>> get(){
        return new ResponseEntity<List<Grasp>>(this.repository.findAll(), HttpStatus.OK);
    }
}
