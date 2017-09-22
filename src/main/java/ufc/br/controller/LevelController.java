package ufc.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufc.br.model.Level;
import ufc.br.service.LevelService;

import java.util.List;

@RestController
@RequestMapping("/levels")
@CrossOrigin(origins = "*")
public class LevelController {

    @Autowired
    private LevelService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Level level){
        return service.save(level);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Level level){
        return service.update(level);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Level> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Level>> get(){
        return service.get();
    }

}