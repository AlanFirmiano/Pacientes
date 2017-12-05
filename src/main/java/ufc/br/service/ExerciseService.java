package ufc.br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ufc.br.model.Exercise;
import ufc.br.model.Grasp;
import ufc.br.model.Object;
import ufc.br.repository.ExerciseRepository;
import ufc.br.repository.GraspRepository;
import ufc.br.repository.MidiaRepository;
import ufc.br.repository.ObjectRepository;

@Service
public class ExerciseService {
	@Autowired
	ExerciseRepository repository;
	@Autowired
	GraspService graspSer;
	@Autowired
	GraspRepository graspRepo;
	@Autowired
	MidiaRepository mRepo;
	@Autowired
	ObjectRepository oRepo;
	public ResponseEntity<String> save(Exercise exercise){
		if(null==repository.findByTitle(exercise.getTitle())){
			if(!exercise.getTitle().equals("")) {
				mRepo.save(exercise.getMidia());
				oRepo.save(exercise.getObjects());
				repository.save(exercise);
				return new ResponseEntity<String>("Exercicio : " + exercise.getTitle() + " cadastrado!", HttpStatus.CREATED);
			}else{
				return new ResponseEntity<String>("Dados invalidos!", HttpStatus.IM_USED);
			}
		}else{
			return new ResponseEntity<String>("Exercicio : "+ exercise.getTitle()+" já cadastrado!", HttpStatus.IM_USED);
		}
	}

	public ResponseEntity<String> delete(Integer id){
		ResponseEntity<List<Grasp>> lista = graspSer.getByExercise(repository.findById(id));
		for(Grasp aux: lista.getBody()) {

			graspRepo.delete(aux.getId());
		}
		repository.delete(id);
		return new ResponseEntity<String>("Exercicio removido!", HttpStatus.OK);
	}

	public ResponseEntity<String> update(Exercise exercise){
		Exercise aux = repository.findByTitle(exercise.getTitle());
		if(null==aux){
			repository.save(exercise);
			return new ResponseEntity<String>("Exercicio : "+ exercise.getTitle()+" atualizado!", HttpStatus.OK);
		}else{
			if(aux.getId().equals(exercise.getId())){
				repository.save(exercise);
				return new ResponseEntity<String>("Exercicio : "+ exercise.getTitle()+" atualizado!", HttpStatus.OK);
			}
			else
				return new ResponseEntity<String>("Exercicio : "+ exercise.getTitle()+" já cadastrado!", HttpStatus.IM_USED);
		}
	}

	public ResponseEntity<Exercise> get(Integer id){
		return new ResponseEntity<Exercise>(this.repository.findOne(id), HttpStatus.OK);
	}

	public ResponseEntity<Exercise> get(String title){
		return new ResponseEntity<Exercise>(this.repository.findByTitle(title), HttpStatus.OK);
	}

	public ResponseEntity<List<Exercise>> get(){
		return new ResponseEntity<List<Exercise>>(this.repository.findAll(), HttpStatus.OK);
	}
}
