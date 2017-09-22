package ufc.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ufc.br.model.Level;
@Repository
public interface LevelRepository extends JpaRepository<Level, Integer>{
    Level findById(Integer id);
}
