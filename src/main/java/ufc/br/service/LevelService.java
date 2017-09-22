package ufc.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufc.br.model.Level;
import ufc.br.repository.LevelRepository;

import java.util.List;

@Service
public class LevelService {
    @Autowired
    LevelRepository repository;

    public ResponseEntity<String> save(Level level){
        repository.save(level);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Level level){
        repository.save(level);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Level> get(Integer id){
        return new ResponseEntity<Level>(this.repository.findOne(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Level>> get(){
        return new ResponseEntity<List<Level>>(this.repository.findAll(), HttpStatus.OK);
    }
}
