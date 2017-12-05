package ufc.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufc.br.model.Permition;
import ufc.br.service.PermitionService;

import java.util.List;

@RestController
@RequestMapping("/permitions")
@CrossOrigin(origins = "*")
public class PermitionController {

    @Autowired
    private PermitionService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Permition permition){
        return service.save(permition);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Permition permition){
        return service.update(permition);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Permition> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Permition>> get(){
        return service.get();
    }
}
