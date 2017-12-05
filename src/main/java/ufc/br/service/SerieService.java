package ufc.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufc.br.model.Serie;
import ufc.br.repository.SerieRepository;

import java.util.List;

@Service
public class SerieService {
    @Autowired
    SerieRepository repository;

    public ResponseEntity<String> save(Serie serie){
        repository.save(serie);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Serie serie){
        repository.save(serie);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Serie> get(Integer id){
        return new ResponseEntity<Serie>(this.repository.findOne(id), HttpStatus.OK);
    }
    public ResponseEntity<List<Serie>> get(){
        return new ResponseEntity<List<Serie>>(this.repository.findAll(), HttpStatus.OK);
    }
}
