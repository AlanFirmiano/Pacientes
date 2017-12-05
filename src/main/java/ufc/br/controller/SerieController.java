package ufc.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufc.br.model.Serie;
import ufc.br.service.SerieService;

import java.util.List;

@RestController
@RequestMapping("/series")
@CrossOrigin(origins = "*")
public class SerieController {

    @Autowired
    private SerieService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Serie serie){
        return service.save(serie);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Serie serie){
        return service.update(serie);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Serie> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Serie>> get(){
        return service.get();
    }
}
