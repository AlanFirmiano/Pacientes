package ufc.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufc.br.model.Object;
import ufc.br.service.ObjectService;

import java.util.List;

@RestController
@RequestMapping("/objects")
@CrossOrigin(origins = "*")
public class ObjectController {

    @Autowired
    private ObjectService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Object object){
        return service.save(object);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Object object){
        return service.update(object);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Object>> get(){
        return service.get();
    }
}
