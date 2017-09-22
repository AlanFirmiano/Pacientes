package ufc.br.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufc.br.model.Grasp;
import ufc.br.service.GraspService;

import java.util.List;

@RestController
@RequestMapping("/grasp")
@CrossOrigin(origins = "*")
public class GraspController {
    @Autowired
    private GraspService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Grasp grasp){
        return service.save(grasp);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        return service.delete(id);
    }

    @PutMapping
    public ResponseEntity<String> update(@RequestBody Grasp grasp){
        return service.update(grasp);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Grasp> get(@PathVariable Integer id){
        return service.get(id);
    }

    @GetMapping
    public ResponseEntity<List<Grasp>> get(){
        return service.get();
    }

}
