package ufc.br.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ufc.br.model.Exercise;
import ufc.br.model.Grasp;
import ufc.br.model.Level;
import ufc.br.model.Recommendation;
import ufc.br.repository.*;

import java.util.List;

@Service
public class GraspService {
    @Autowired
    GraspRepository repository;
    @Autowired
    ExerciseRepository exeRepo;
    @Autowired
    ExerciseService exeService;
    @Autowired
    LevelRepository levRepo;
    @Autowired
    RecommendationRepository recRepo;
    @Autowired
    SerieRepository serRepo;
    public ResponseEntity<String> save(Grasp grasp){
        if(null == exeRepo.findByTitle(grasp.getExercise().getTitle())) {
            exeService.save(grasp.getExercise());
        }
        Exercise x = exeRepo.findByTitle(grasp.getExercise().getTitle());
        grasp.setExercise(x);
        Level aux = levRepo.findByLevel(grasp.getLevel().getLevel());
        if(aux!=null){
            grasp.setLevel(aux);
        }else {
            grasp.setLevel(levRepo.save(grasp.getLevel()));
        }
        grasp.getRecommendation().setSerie(serRepo.save(grasp.getRecommendation().getSerie()));
        grasp.setRecommendation(recRepo.save(grasp.getRecommendation()));

        repository.save(grasp);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> delete(Integer id){
        repository.delete(id);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<String> update(Grasp grasp){
        repository.save(grasp);
        return new ResponseEntity<String>("sucesso", HttpStatus.OK);
    }

    public ResponseEntity<Grasp> get(Integer id){
        return new ResponseEntity<Grasp>(this.repository.findOne(id), HttpStatus.OK);
    }

    public ResponseEntity<List<Grasp>> get(){
        return new ResponseEntity<List<Grasp>>(this.repository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<List<Grasp>> getByExercise(Exercise exercise){
        return new ResponseEntity<List<Grasp>>(this.repository.findByExercise(exercise), HttpStatus.OK);
    }
}
