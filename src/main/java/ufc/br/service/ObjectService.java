package ufc.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufc.br.model.Object;
import ufc.br.repository.ObjectRepository;

import java.util.List;

@Service
public class ObjectService {
    @Autowired
    ObjectRepository repository;

    public ResponseEntity<String> save(Object object){
        repository.save(object);
        return new ResponseEntity<String>(object.getName()+" adicionado!", HttpStatus.OK);

    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("removido", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Object object){
        repository.save(object);
        return new ResponseEntity<String>("autualizado", HttpStatus.OK);
    }

    public ResponseEntity<Object> get(Integer id){
        return new ResponseEntity<Object>(this.repository.findOne(id), HttpStatus.OK);
    }
    public ResponseEntity<List<Object>> get(){
        return new ResponseEntity<List<Object>>(this.repository.findAll(), HttpStatus.OK);
    }
}
