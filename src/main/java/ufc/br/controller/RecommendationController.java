package ufc.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufc.br.model.Recommendation;
import ufc.br.service.RecommendationService;

import java.util.List;

@RestController
@RequestMapping("/recommendation")
@CrossOrigin(origins = "*")
public class RecommendationController {
    @Autowired
    private RecommendationService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Recommendation recommendation){
        return service.save(recommendation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Recommendation recommendation){
        return service.update(recommendation);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recommendation> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Recommendation>> get(){
        return service.get();
    }

}
