package ufc.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufc.br.model.Midia;
import ufc.br.service.MidiaService;

import java.util.List;

@RestController
@RequestMapping("/midias")
@CrossOrigin(origins = "*")
public class MidiaController { @Autowired
private MidiaService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Midia midia){
        return service.save(midia);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Midia midia){
        return service.update(midia);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Midia> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Midia>> get(){
        return service.get();
    }

}
