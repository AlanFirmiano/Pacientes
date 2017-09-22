package ufc.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufc.br.model.Recommendation;
import ufc.br.repository.RecommendationRepository;

import java.util.List;

@Service
public class RecommendationService {
    @Autowired
    RecommendationRepository repository;

    public ResponseEntity<String> save(Recommendation recommendation){
        repository.save(recommendation);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Recommendation recommendation){
        repository.save(recommendation);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Recommendation> get(Integer id){
        return new ResponseEntity<Recommendation>(this.repository.findOne(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Recommendation>> get(){
        return new ResponseEntity<List<Recommendation>>(this.repository.findAll(), HttpStatus.OK);
    }
}
