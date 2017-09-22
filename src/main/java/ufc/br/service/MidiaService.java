package ufc.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufc.br.model.Midia;
import ufc.br.repository.MidiaRepository;

import java.util.List;

@Service
public class MidiaService {
    @Autowired
    MidiaRepository repository;

    public ResponseEntity<String> save(Midia midia){
        repository.save(midia);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Midia midia){
        repository.save(midia);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Midia> get(Integer id){
        return new ResponseEntity<Midia>(this.repository.findOne(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Midia>> get(){
        return new ResponseEntity<List<Midia>>(this.repository.findAll(), HttpStatus.OK);
    }
}
