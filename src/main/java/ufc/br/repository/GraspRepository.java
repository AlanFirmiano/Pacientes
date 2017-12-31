package ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ufc.br.model.Exercise;
import ufc.br.model.Grasp;

import java.util.List;
@Repository
public interface GraspRepository extends JpaRepository<Grasp,Integer> {
    Grasp findById(Integer id);

    List<Grasp> findByExercise(Exercise exercise);

    @Query("from Grasp order by exercise.title")
    List<Grasp> findAll();
}
